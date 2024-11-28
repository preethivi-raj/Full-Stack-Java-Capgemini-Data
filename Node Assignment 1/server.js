import express from 'express';
import cors from 'cors';
import dotenv from 'dotenv';
import cookieParser from 'cookie-parser';


import adminRoutes from './routes/adminRoutes.js';
import userRoutes from "./routes/userRoutes.js"

import dbConnection from './db/dbConnection.js';


dotenv.config();
const PORT = process.env.PORT || 5000;

const app = express();
app.use(cors());
app.use(cookieParser());
app.use(express.json());
app.use(express.urlencoded({ extended: true }));


 app.use("/api/admin" , adminRoutes);
 app.use("/api/user"  , userRoutes);

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    dbConnection();
});