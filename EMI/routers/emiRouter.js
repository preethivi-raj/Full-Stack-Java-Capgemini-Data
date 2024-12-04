import express from "express"

import { getLoanOffer } from "../controllers/emiController.js";

const router = express.Router();


router.post("/" , getLoanOffer);

export default router;