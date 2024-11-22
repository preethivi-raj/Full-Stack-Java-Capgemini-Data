const add = document.getElementById("add");

add.addEventListener("click" , ()=>{
    window.location.href="addEmp.html";
})

const remove = document.getElementById("remove");

remove.addEventListener("click" ,()=>{
    window.location.href = "removeEmp.html";
})

const search = document.getElementById("search");

search.addEventListener("click" , ()=>{
    window.location.href = "searchEmp.html";
})