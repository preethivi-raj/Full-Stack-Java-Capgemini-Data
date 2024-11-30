import mongoose from "mongoose";

const productSchema = new mongoose.Schema(
  {
    name: {
      type: String,
    },
    price: {
      type: String,
    },
    category: {
      type: String,
    },
    manufacturingDate: {
      type: String,
    },
    expiryDate: {
      type: String,
    },
  },
  { timestamps: true }
);

const Product = mongoose.model("product", productSchema);
export default Product;
