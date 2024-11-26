const url = require('url');
 
const exampleurl = 'http://localhost:8080/default.htm?year=2017&month=february';
const parsedurl = url.parse(exampleurl , true);
 
console.log('pased URL Components :');
console.log(parsedurl.protocol);
console.log('Host :',parsedurl.host);
console.log('Port : ',parsedurl.hostname);
console.log('Pathname : ',parsedurl.pathname);
console.log('Search' , parsedurl.search);
console.log('Query : ',parsedurl.query);

console.log(parsedurl);
 
const newUrl = url.format({
    protocol: 'https:',
    hostname: 'www.preethiviraj.com',
    port :5000,
    query :{
        name: 'Kumar',
        age : 30
    }
 
});


console.log('Constructed URL :',newUrl);


const ans =parsedurl.search.split("&")

console.log(ans);