import express from "express";

import {
  addProduct,
  getProduct,
  getAllProducts,
  getCategoryProducts,
} from "../controllers/admin.controllers.js";

const router = express.Router();

router.post("/add", addProduct);
router.get("/:name", getProduct);
router.get("/all/getAll", getAllProducts);
router.get("/category/:category", getCategoryProducts);

export default router;
