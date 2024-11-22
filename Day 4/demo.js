const date_dom=document.getElementById("date");
const date = new Date();
date_dom.innerHTML = date;

function fun (){
    const colors = ["green" , "yellow" , "aqua" , "brown" , "black" ,"red" , "yellowgreen"] ;
    const setColor = colors[Math.floor(Math.random()*7)]
    const ele = document.getElementById("color")
    ele.style.cssText = `background-color: ${setColor};`
}

const story  = document.body.querySelector("#story")

const set = document.body.querySelector("#button")

set.addEventListener("click" , ()=>{
    story.textContent = "lorem is good"
})

const clr = document.body.querySelector("#button2")
clr.addEventListener("click" , ()=>{
    story.textContent = ""
})
