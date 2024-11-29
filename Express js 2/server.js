import express from "express" ;
import path from "path";
import { title } from "process";

const __dirname  = path.resolve();
const app = express();

app.use(express.json());
app.use(express.urlencoded({extended : true}));

const data = [
    {
        title : "Happy Life",
        author : "Kamal"
    },
    {
        title :"Sad Life",
        author : "Rajini"
    }
]

app.get("/" , (req , res)=>{
    res.send(
        `<ul>
             ${data.map((data)=>{
                return(
                   ` <li>${data.title}: ${data.author}</li>`
                )
             })}
        </ul>
        <button> <a href="/form" >Click here to add</a> </button>        
        `

    )
})
 
app.get("/form",(req , res)=>{
    
    res.sendFile(path.join(__dirname , "views","index.html"))
})

app.post("/add" , (req , res)=>{
    const title = req.body.title;
    const author  = req.body.author;
    const formData  = {
        title : title ,
        author : author
    }
    data.push(formData);
    res.send("Added");
})

app.listen(3000 , ()=>{
    console.log("Server is running on port 3000");
})
