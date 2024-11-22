
// const a = [1,2,3];
// const b= [5,6,7];

// const c= a.concat(b);

// console.log("Concat array : " ,c)


// const d =[a,b]

// console.log(d);
// //spread - expands the array in to iterables elements
// const e=[...a ,...b];
// console.log(e);
// //rest  - collect the elements into array 
// function demo (...p){
//     // let a1 = Array.from(b)
//     // let a2 = a1.map((x)=>x*2)

//     let a2 = p.map(x=>x*2)
//     console.log("Rest "+a2)
// }

// demo(1,2,3)

// function itr(val,key,map){
//     console.log(`[${key}] = ${val}`)
// }

// const map =new Map ([['a',10],['b',12],['x','13']]).forEach(itr)

// //set 
// const s = new Set([1,2,3,4,5,6,7]);
// console.log("set : ",typeof(s) , s);
// s.add(9)
// console.log(s)
// s.delete(3)
// console.log(s)
// console.log(s.has(4))
// for(let val of s){
//     console.log(val)
// }
// console.log("Size of the set : "  , s.size)
//  class Employee {
//     constructor(id ,name){
//         this.id = id;
//         this.name = name;
//     }
//     details (){
//         document.writeln(this.id + " "+this.name + '<br>')
//     }
//  }

//  var e1  = new Employee(101,'Kokki Kumar')

// var map1 = new Map()

// map1.set("first name"  , "Robb");

// console.log(map1.get("first name"))


let win = true ;

function getUsers(){
  return new Promise((resolve , reject )=>{
    setTimeout(()=>{ 
        if(win){
        resolve([   {name: 'John', age: 25},
        {name: 'Jane', age: 30},
        {name: 'Bob', age: 35} 
    ]); 
}else{
        reject('Error');}
    }, 1000);
  });
}

function fullfill(users){
    console.log(users);
}

function reject(error){
    console.log(error);
}
const prom = getUsers();
prom.then(fullfill , reject);

//preethiviraj
const as=10



  
        
  
 

