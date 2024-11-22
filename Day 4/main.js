//ANonymous Function
let fun = function (){
    console.log("Hi , this is first program in js")
}
fun();

//IIFE
(function(a,b){
    console.log(`This is IIFE function and this are the parameters ${a} , ${b}`)
})(23,3)

//arrow function

const good = ()=>{
    console.log("GM , Preethivi")
}
good()

const add = (a,b)=>a+b;
const sub = (a,b) => { return a-b}
console.log(add(12,2))

const group = {
    members :["Preethivi" , "Kumar" , "Nithis"],
    groupName : "Friends",
    groupMsg : function (){
        this.members.forEach((member)=>{
            console.log(`${member} is in the group ${this.groupName}`)
        })
    }
}

group.groupMsg() //lexical bind "this" to the group object context
const keys = Object.keys(group)
console.log(keys)

const student  = {
    firstname : "Preethivi",
    rollNo : "20eumt057",
    course : "BE-Mechatronics"
}

student.lastname = "Raj"
console.log(student)

const std_copy = student ;

std_copy.name = "kumar"

console.log(student)

const person = {
    title : {
        name :"Person Details",
    },
    names : ["Sanjai" , "Sanju" , "Raju"],
    age : [22,23,24],
    bio(){
        console.log("This is called object literals")
    }
}

function createObj(name){
    const obj  = {}
    obj.name = name
    obj.intro = function (){
        console.log(`Hello! Everyone I am ${this.name}`)
    }
    return obj
}

const jack = createObj("Jack")
jack.intro()


function Person (name) {
    this.name = name 
    this.intro = function (){
        console.log(`Hello! Everyone I am ${this.name}`)
    }
}

const Aravind = new Person ("Aravind")
Aravind.intro();

// function Employee (name , id , skills, salary ,exp) {
//     this.name = name ;
//     this.id = id;
//     this.salary = salary;
//     this.skills= skills;
//     this.exp = exp;
//     this.increment = exp>=20 ? salary *0.2 + salary : "No Increment"
// }
const emp = new Employee("Kuamr" , 123131, ["Java" ,"Js" , "CPP"] ,12000 , 20)
console.log(emp);


//prototype
function Employee (name , des , yearOfBirth) {
    this.name =name;
    this.des = des;
    this.yearOfBirth = yearOfBirth;
}

Employee.prototype.calculateAge =  function (){
    console.log("The current age is " + (2024 - this.yearOfBirth))
}

console.log(Employee.prototype)

let emp1=new Employee("alex" ,"SR dev" , 1995)
console.log(emp1)
emp1.calculateAge()

function Car(){
    this.name = "BMW"
}
Car.prototype.color="Green"

let c1 = new Car();

console.log(`Color of the car ${c1.color}`)
console.log(Object.getPrototypeOf(c1))

Car.prototype.color="White"

let c2 = new Car();

console.log(`Color of the car is ${c1.color}`);
console.log(`Color of the car is ${c2.color}`);


