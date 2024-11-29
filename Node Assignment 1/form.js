const http  = require("http");
const fs = require("fs")

const fileName = "formData.txt";

const addDataToFile = (dataToAdd)=>{
   try {
       if(fs.existsSync(fileName)){
        fs.appendFileSync(fileName, dataToAdd);
       }
       else{
        fs.writeFileSync(fileName , dataToAdd);
       }
   } catch (error) {
      console.log("Error in file handling", error)
   }
}


const server = http.createServer((req , res)=>{
        let body = '';
        req.on('msg', chunk => {
            body += chunk;
        });
        console.log(body.msg);
        addDataToFile(body)
        res.writeHead(200, {"Content-Type" : "application/json"})
        res.end();
     
})


server.listen(3000 , ()=>{
    console.log("Server is running on 3000");
})