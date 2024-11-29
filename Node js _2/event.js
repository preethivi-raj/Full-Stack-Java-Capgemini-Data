const fs = require("fs");
console.log("Start");
setTimeout(()=>{
    console.log("Time 1");
},0);

setImmediate(()=>{
    console.log("Immediate 1");
})

fs.readFile(__filename , ()=>{
    console.log("File readed")
})

setTimeout(()=>{
    console.log("time 2")
},0)

console.log("End");


// for(const val of ['a','b']){
//     console.log(val)
// }

// function T(){
//     console.log("T")
// }

// T()

// setImmediate(function() {
//     console.log("Outer setImmediate");
//     setTimeout(function() {
//       console.log("setTimeout inside setImmediate");
//     }, 0);
//     // Promise.resolve().then(function() {
//     //   console.log("Promise inside setImmediate");
//     // });
//   });
  
//   setTimeout(function () {
//     console.log("Outer setTimeout");
//     setImmediate(function() {
//       console.log("setImmediate inside setTimeout");
//     });
//   }, 0);
  
//   console.log("Main code");


// setTimeout(()=>{
//     console.log("Time 1")
// },0)

// setImmediate(()=>{
//     console.log("Immediate 1")
// })
  
// setTimeout(()=>{
//     setImmediate(()=>{
//         console.log("Immediate 2")
//     })
//     console.log("Time 2")
// },0)