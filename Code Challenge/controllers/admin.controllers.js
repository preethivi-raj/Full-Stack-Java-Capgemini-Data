import Product from "../models/products.model.js";

export const addProduct = async (req, res) => {
  try {
    const { name, price, category, manufacturingDate, expiryDate } = req.body;
    if (!name || !price || !category || !manufacturingDate || !expiryDate) {
      return res.status(400).json({ message: "Please fill all the fields" });
    }
    const product = new Product({
      name,
      price,
      category,
      manufacturingDate,
      expiryDate,
    });
    if (!product) {
      return res.status(400).json({ message: "Product not created" });
    }
    await product.save();
    res.status(201).json({
      message: "Product added successfully",
    });
  } catch (error) {
    console.log(`Error in addProduct controller: ${error}`);
    res.status(500).json({ message: "Internal Server Error" });
  }
};

export const getProduct = async (req, res) => {
  try {
    let name = req.params.name;
    name = name.charAt(0).toLowerCase() + name.slice(1).toLowerCase();

    const product = await Product.find({ name: new RegExp(`^${name}$`, "i") });

    if (product.length == 0) {
      return res.status(404).json({
        message: "Product not Found",
      });
    }

    res.status(200).json(product);
  } catch (error) {
    console.log(`Error in getProduct controller: ${error}`);
    res.status(500).json({ message: "Internal Server Error" });
  }
};

export const getAllProducts = async (req, res) => {
  try {
    const products = await Product.find();
    if (!products) {
      return res.status(400).json({ message: "No products found" });
    }
    res.status(200).json(products);
  } catch (error) {
    console.log(`Error in getAllProducts controller: ${error}`);
    res.status(500).json({ message: "Internal Server Error" });
  }
};

export const getCategoryProducts = async (req, res) => {
  try {
    let category = req.params.category;

    category =
      category.charAt(0).toLowerCase() + category.slice(1).toLowerCase();

    const products = await Product.find({ category: category });
    if (!products) {
      return res.status(400).json({ message: "No products found" });
    }
    res.status(200).json(products);
  } catch (error) {
    console.log(`Error in getCategoryProduct controller: ${error}`);
    res.status(500).json({ message: "Internal Server Error" });
  }
};
