import express from "express";
import dotenv from "dotenv";
import cors from "cors";
import path from "path";

import adminRouter from "./routers/admin.routers.js";
import authRouter from "./routers/auth.routers.js";

import dbConnection from "./db/dbConnection.js";

const PORT = 3000;

dotenv.config();

const app = express();
const __dirname = path.resolve();

app.use(
  cors({
    origin: "*",
  })
);

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use("/api/admin", adminRouter);
app.use("/api/auth", authRouter);

app.use(express.static(path.join(__dirname, "views")));
app.use("*", (req, res) => {
  res.sendFile(path.join(__dirname, "views", "index.html"));
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
  dbConnection();
});
