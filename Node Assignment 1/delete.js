const http = require('http');
const url = require('url'); //to parse the request url 
const querystring = require('querystring'); //to parse the query string of the request url
 
//store data for simplicity (in-memory)node
let data = ['product 1','Product 2','Product 3'];
 
//create the http server 
const server = http.createServer((req, res) => {
    const parsedUrl = url.parse(req.url ,  true);// http://www.abc.com/inbox?mail = TCS
    /* url.parse() parses a URL string into an object and break down into its variouse component(like prtocol , hostname , path etc)
    req.url => this is URL part of incoming HTTP request when client make request (like /inbox or /inbox ? mail= 'TCS')
    true=> it tells url.parse() to also pase the query string( part after ? in the url ) into an object . if it is true , the query parameter are converted into javascript object , make it easier to access them . 
     */
    const pathname = parsedUrl.pathname ; //--- /inbox 
    /* paserdUrl.pathname = it will extract th epath from parsed url object . It is the part of url that specifies resources being requested on the server .exculed domain name , protocol and query paramaeters . 
     */
 
    //handleing Get request to display the current products 
    if(pathname === '/' && req.method === 'GET'){
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write('<h1> Product List</h1>');
        res.write('<ul>');
        data.forEach(product => {
            res.write(`<h2>${product}<\h2>`)
        });
        res.write('</ul>');
        // form for adding new items 
        res.write(`
<form method="POST" action="/add-item">
<input type="text" name="item" placeholder="New Item" required>
</input>
<button type="submit"> add items</button>
</form>`)
        res.write(`
<form method="POST" action="/delete-item">
<input type="text" name="item" placeholder="Item to Delete" required />
<button type="submit">Delete Item</button>
</form>
            `)
        res.end();
    }
    // Handling POST request to add a new item
else if (pathname === '/add-item' && req.method === 'POST') {
    let body = '';
    req.on('data', chunk => {
      body += chunk;
    });
    req.on('end', () => {
      const parsedBody = querystring.parse(body);
      const newItem = parsedBody.item;
      data.push(newItem); // Add the new item to the data array
      res.writeHead(302, { 'Location': '/' }); // Redirect back to the list
      res.end();
    });
  }
 
  // Handling POST request to delete an item
  else if (pathname === '/delete-item' && req.method === 'POST') {
    let body = '';
    req.on('data', chunk => {
      body += chunk;
    });
    req.on('end', () => {
      const parsedBody = querystring.parse(body);
      const itemToDelete = parsedBody.item;
      data = data.filter(item => item !== itemToDelete); // Remove the item from the data array
      res.writeHead(302, { 'Location': '/' }); // Redirect back to the list
      res.end();
    });
  }
 
  // Handling DELETE request
  else if (pathname === '/delete' && req.method === 'DELETE') {
    const parsedBody = parsedUrl.query; // Query parameters from the URL
    const itemToDelete = parsedBody.item;
 
    // Remove the item from the data array
    data = data.filter(item => item !== itemToDelete);
 
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ message: 'Item deleted successfully', data }));
  }
 
  // Handle 404 for undefined routes
  else {
    res.writeHead(404, { 'Content-Type': 'text/html' });
    res.write('<h1>404 Not Found</h1>');
    res.end();
  }
});
 
 
server.listen(3000 , ()=>{
    console.log(`sever running on the port 3000`)
    })