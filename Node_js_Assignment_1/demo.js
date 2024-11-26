const http = require('http');
const fs = require('fs');
const url = require('url');
const  path = require('path');
 
http.createServer(function (request, response) {
  
    const pathname = url.parse(request.url).pathname;
    console.log('Request for ' + pathname + ' received.');
 
    const filePath = pathname; 
   
    if (filePath === "") {
        filePath = "test.html";  
    }
   
    const  fullPath = path.join(__dirname, filePath); 
 
   
    fs.readFile(fullPath, function (err, data) {
        if (err) {
            console.log(err.stack);
            response.writeHead(404, { 'Content-Type': 'text/html' });
            response.write('<h1>404 - File Not Found</h1>');
        } else {
            response.writeHead(200, { 'Content-Type': 'text/html' });
            response.write(data.toString());
        }
        response.end();
    });
 
}).listen(3000);
 
console.log('Server running at http://127.0.0.1:3000/test.html');