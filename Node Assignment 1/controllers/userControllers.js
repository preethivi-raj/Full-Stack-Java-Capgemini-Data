import Product from "../models/productModel.js";

export const getAllProducts = async (req, res) => {
    try {
        const products = await Product.find();
        if(products.length === 0){
            return res.status(404).json({ message: 'Products not found' });
        }
        res.json(products);
    } catch (error) {
        console.log(`Error in get all products controller : ${error}`);
        res.status(500).json({ message: 'Server Error' });
    }
}

export const getCategoryProducts = async(req , res)=>{
    try {

        const category = req.params.category;
        if(!category){
            return res.status(400).json({ message: 'Category is required' });
        }

        const products = await Product.find({category : category});

        if(products.length === 0){
            return res.status(404).json({ message: 'Products not found' });
        }
        
        res.status(200).json(products);
    } catch (error) {
        console.log(`Error in get category product controller : ${error}`);
        res.status(500).json({ message: 'Server Error' });
    }
}