import mongoose from "mongoose";

const productSchema = mongoose.Schema({
    name:{
        type: String,
        required: true
    },
    discription : {
        type: String,
        required: true
    },
    price : {
        type: Number,
        required: true
    },
    countInStock : {
        type: Number,
        required: true
    },
    imageUrl : {
        type: String,
        
    },
    category : {
        type: String,
        required: true
    },
},{timestamps: true})

const Product = mongoose.model('Product', productSchema);
export default Product;