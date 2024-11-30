import User from "../models/users.model.js";
import bcrypt from "bcryptjs";

export const login = async (req, res) => {
  try {
    const { email, password } = req.body;

    if (!email || !password) {
      return res.status(400).json({
        message: "Please provide all the fields",
      });
    }

    const user = await User.findOne({ email: email });
    if (!user) {
      return res.status(404).json({
        message: "User not found",
      });
    }
    const isMatch = await bcrypt.compare(password, user.password || "");
    if (!isMatch) {
      return res.status(400).json({
        message: "Invalid Credentials",
      });
    }

    res.status(200).json({
      message: "Login Successful",
      role: user.role,
    });
  } catch (error) {
    console.log(`Error in login controller: ${error}`);
    res.status(500).json({
      message: "Internal Server Error",
    });
  }
};

export const signup = async (req, res) => {
  try {
    const { username, email, password } = req.body;
    const existingUser = await User.findOne({ email: email }).select(
      "-password"
    );
    if (existingUser) {
      return res.status(400).json({ message: "User already exists" });
    }
    if (!username || !email || !password) {
      return res.status(400).json({ message: "Please provide all the fields" });
    }
    const salt = await bcrypt.genSalt(12);
    const hashedPassword = await bcrypt.hash(password, salt);

    const user = await User.create({
      username,
      email,
      password: hashedPassword,
    });
    if (!user) {
      return res.status(400).json({
        message: "User not created",
      });
    }
    res.status(201).json({
      message: "User created successfully",
    });
  } catch (error) {
    console.log(`Error in signup controller: ${error}`);
    res.status(500).json({
      message: "Internal Server Error",
    });
  }
};

export const getMe = async (req, res) => {
  try {
    const user = await User.findById(req.user._id).select("-password");
  } catch (error) {
    console.log(`Error in getMe controller: ${error}`);
    res.status(500).json({
      message: "Internal Server Error",
    });
  }
};
