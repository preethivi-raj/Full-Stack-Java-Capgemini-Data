import mongoose from "mongoose";

const dbConnection = async ()=>{
    try {
        await mongoose.connect(process.env.MONGO_URI);
        console.log(`MongoDB connected successfully`);
    } catch (error) {
        console.log(`Error in connection to database: ${error}`);
        process.exit(1);
    }
}

export default dbConnection;