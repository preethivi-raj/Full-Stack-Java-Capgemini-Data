import { count } from 'console';
import Product from '../models/productModel.js';

export const addProduct = async (req, res) => {
    try {
        const { name, price,countInStock , description, category, imageUrl } = req.body;
        if (!name || !price || !countInStock || !description || !category || !imageUrl) {
            return res.status(400).json({ message: 'All fields are required' });
        }
        const product = new Product({
            name : name,
            price : price,
            countInStock :countInStock,
            description : description,
            category :category,
            imageUrl :imageUrl,
        });
        await product.save();
        res.status(201).json({ message: 'Product added successfully' });
    } catch (error) {
        res.status(500).json({ message: 'Server Error' });
    }
}