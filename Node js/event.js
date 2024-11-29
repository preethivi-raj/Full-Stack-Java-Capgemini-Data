//const EventEmitter= require("events");
// const myEmi = new EventEmitter();

// myEmi.on("welcome" , (name)=>{
//     console.log("Welcome to my event" , name)
// });

// myEmi.emit("welcome","Node js");

// const EventEmitter = require("events");
// const http = require("http");

// const myEmi = new EventEmitter();

// myEmi.on("reqEvent" , (url)=>{
//     console.log("Request on this url : " , url)
// })

// const server = http.createServer((req , res)=>{
//     myEmi.emit("reqEvent" , req.url)
    
//     res.writeHead(200 , {"Content-Type" : "text/plain"});
//     res.write("Event-Driven HTTP server !!")
//     res.end();
// })

// server.listen(3000 , "127.0.0.1",()=>{
//     console.log("Server is running on 3000")
// })

// const { Console } = require("console");
// const fs = require("fs");
// const readStream = fs.createReadStream("example.txt"  , "utf8" );

// readStream.on("data" , (chunk)=>{
//     console.log("new data chunk recevied" , chunk)
// });

// readSt7ream.on("end",  ()=>{
//     console.log("File Reading Completed");
// });

// readStream.on("error", (err)=>{
//     console.log("Error in reading file" , err)
// });

const EventEmitter = require("events");
const { send } = require("process");

class UserEvent extends EventEmitter{}

const userEvent  = new UserEvent();


const sendEmail  =  ()=>{
    setTimeout(()=>{ 
        console.log("Email Send");
    },2000)
}


//regsiter
userEvent.on("register" , (userData)=>{
    console.log(`User Registered : ${userData.name}`)
})

//login
userEvent.on("login" ,(userData)=>{
    console.log(`User Logged In : ${userData.name}`)

      sendEmail();
})

//emitting events
const newUser =  {
    name :"Musk",
    email : "musk@gmail.com"
};

userEvent.emit("register",newUser);
userEvent.emit("login",newUser);







