// class Person {
//     constructor (name , age) {
//         this.name =name;
//         this.age= age;
//     }

//     display(){
//         console.log(`Hi! this is my name ${this.name}  and this is my age ${this.age}`);
//     }
// }

// const p1 = new Person("Preethivi" , 24)

// p1.display();


// class Animal { 
//     // constructor(name , food){
//     //     this.name =name;
//     //     this.food=food;
//     // }

//     name = "Tom";
//     food = "Chicken"

//     animalProp () {
//         return `${this.name} ${this.food}`
//     }
//     msg(){
//         return `I am an animal ${this.name}`;
//     }
// }

// class Dog extends Animal {
//     constructor(name , food , breed){
//         super(name , food); //constructor overriding
//         this.breed = breed;
//     }

//     breedName (){
//         return `${this.breed}`
//     }
//     msg(){
//         return ` I am an animal ${this.name}  , I am a  ${this.breed}`
//     }
// }

// const dog  = new Dog( "","","Dog")
// console.log(dog.msg())


//parent class 
// class Animal {
//     static staticword;
//     static{
//         console.log('satic block');
//         Animal.staticword = {};
//     }
//     constructor(name, food) {
//         this.name = name;
//         this.food = food ; 
//     }
//     animalProp(){
//         return `${this.name} ${this.food}`;
//     }
//     static msg(){
//         return `I am an animal ${this.name}`;
//     }
// }
// //child class 
//  class Dog extends Animal {
//     static prop = 'Love Dog ';
//     constructor(name, food, breed) { 
//         super(name, food); //constructor overriding 
//         this.instanceprop = {};
//         this.breed = breed;
//     }
//     breedName(){
//         return `${this.breed}`;
//     }
//     static msg(){ //method overridding 
//         return `I am an animal ${this.name}, my breed is  ${this.breed}`;
//     }
//  }
//  let a1 = new Dog ('Tom ' , 'dogFood' ,'Dog' );
//  let b1 = new Dog ('JIm' , 'Cat' , "milk");
//  console.log(Dog.msg()); //static method 
//  console.log(Dog.prop);
//  console.log(a1.prop ==  b1.prop);
//  console.log(a1.instanceprop == b1.instanceprop );


const array = [1,2,3,4];
const newArray = array.map((v)=>{
    return v*2
})
console.log(newArray)

const new1 = array.reduce((acc , curr)=>{
    return acc+curr;
})
console.log(new1)

const shift1 = array.shift()
console.log(shift1)

const unshift  = array.unshift(20)
console.log(unshift)
console.log(array)