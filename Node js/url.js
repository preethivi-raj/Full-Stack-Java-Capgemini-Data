const http = require("http");
const url = require("url");
const queryString = require("querystring");
const fs = require("fs");

const PORT = 3000;

let data = ["product 1" , "product 2" , "product 3", "product 4"];


const server = http.createServer((req , res)=>{
    const parsedUrl = url.parse(req.url , true);
    console.log(parsedUrl);
    const pathName = parsedUrl.pathname;
    
    if(pathName === "/" && req.method == "GET"){
        res.writeHead(200 , {"Content-Type" : "text/html"})
        res.write('<h1> Product Name </h1>')
        res.write('<ul>')
        data.forEach((prod)=>{
            res.write(`<h2> ${prod} </h2>`)
        })
        res.write('</ul>')
    }
    else if(pathName === "/delete" && req.method == "GET"){
        const id  = parsedUrl.query.id
        const filtered  = data.filter((data , index)=> index != id )
        res.writeHead(200 , {"Content-Type" : "text/html"})
        res.write('<h1> Product Name </h1>')
        res.write('<ul>')
        filtered.forEach((prod)=>{
            res.write(`<h2>Delete: ${prod} </h2>`)
        })
        res.write('</ul>')
    }
}) 

server.listen(PORT , ()=>{
    console.log(`Server is running on port ${PORT}`)
})