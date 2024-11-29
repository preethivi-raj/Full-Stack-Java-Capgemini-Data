const repl = require("repl");
const server = repl.start("Custom REPL");

server.context.myvar = "Hello REPL";
server.context.fun =  function(name){
    return `Hello , ${name } ! welcome`;
}

