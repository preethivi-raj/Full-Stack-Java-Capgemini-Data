
import express from "express"

const app = express();

app.use(express.json)
app.use(express.urlencoded({extended : true}))


app.get("/",(req , res)=>{
   res.send("hello")
})

app.listen(3000 , ()=>{
    console.log("Server is running on port 3000");
})





// import express  from "express";
// const app = express();
// app.set('view engine', 'pug');

// app.get('/', (req, res) => {
//   res.render('index' );
// });

// app.listen(3000, () => {
//   console.log('Listening on port 3000...');
// });




















// import express from "express"
// import path  from "path";

// const app = express();
// const PORT = 3000;

// const __dirname = path.resolve();

// // app.set('view engine', 'ejs');
// // app.set('views', __dirname + '/views');


// app.get("/" , (req , res)=>{
//     //res.send("Welcome")
//     res.render('index', { message: 'Hello, world!' });
// })

// app.listen(PORT , ()=>{
//     console.log(`Server is running on Port: ${PORT}`)
// })