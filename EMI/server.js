import express from "express"
import path from "path";
import dotenv from "dotenv"

const __dirname = path.resolve();

import emiRouter from "./routers/emiRouter.js";

dotenv.config();

const app = express();

app.use(express.json());
app.use(express.urlencoded({
    extended : true
}));

const PORT = process.env.PORT;

app.use("/api/emi" , emiRouter)

app.use(express.static(
    path.join(__dirname , "views" )
))


app.listen(PORT , ()=>{
    console.log(`Server is running on ${PORT}`);
})