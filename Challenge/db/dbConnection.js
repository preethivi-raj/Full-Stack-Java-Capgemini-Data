import mongoose from "mongoose";

const dbConnection = async () => {
  try {
    await mongoose.connect(
      "mongodb+srv://preethivirajm:1234567890@cluster0.8j1lg.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
    );
    console.log("You successfully connected to MongoDB!");
  } catch (error) {
    console.log(`Error in db connection : ${error.message}`);
  }
};

export default dbConnection;

// import mongoose  from "mongoose";

// const dbConnection  = async()=>{
//     try {
//         const conn = await mongoose.connect(process.env.MONGO_URL);
//         console.log(`MongoDB Connected : ${conn.connection.host}`);
//     } catch (error) {
//         console.log(`Error : ${error.message}`);
//         process.exit(1);
//     }
// }

// export default dbConnection;
