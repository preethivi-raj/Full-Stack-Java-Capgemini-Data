import express from "express"

import { getAllProducts  ,getCategoryProducts} from "../controllers/userControllers.js";

const router = express.Router();

router.get("/" , getAllProducts)
router.get("/category" , getCategoryProducts)

export default router;