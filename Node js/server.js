import http from "http";
import fs from "fs";    
import querystring from "querystring";
import dotenv from "dotenv";


dotenv.config(); 
const PORT = process.env.PORT || 3000;


const user = {
    username: "admin",
    password: "admin",
    };

const serveFile = (res, fileName) => {
  fs.readFile(fileName, (err, data) => {
    if (err) {
      res.writeHead(404, { "Content-Type": "text/plain" });
      res.end("404 Not Found");
    } else {
      res.writeHead(200, { "Content-Type": "text/html" });
      res.end(data);
    }
  });
};


const server = http.createServer((req, res) => {
  if (req.method === "GET") {
    if (req.url === "/") {

      serveFile(res, "login.html");
    } else if (req.url === "/welcome") {
      
      serveFile(res, "welcome.html");
    } else {

      res.writeHead(404, { "Content-Type": "text/plain" });
      res.end("404 Not Found");
    }
  } else if (req.method === "POST" && req.url === "/login") {
   
    let body = "";
    req.on("data", (chunk) => {
      body += chunk.toString();
    });
    req.on("end", () => {
      const { username, password } = querystring.parse(body);

      if (username === user.username && password === user.password) {
        res.writeHead(302, { Location: "/welcome" });
        res.end();
      } else {
        res.writeHead(401, { "Content-Type": "text/html" });
        res.end("<h1>Invalid credentials</h1><a href='/'>Go back</a>");
      }
    });
  } else {
    res.writeHead(404, { "Content-Type": "text/plain" });
    res.end("404 Not Found");
  }
});


server.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
  
});
