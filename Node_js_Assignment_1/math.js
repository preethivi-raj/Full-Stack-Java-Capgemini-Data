const add  = (a,b)=>{
   return a+b;
}

const sub = (a,b)=>{
    return a>b  ?a-b : b-a;
}

const mul= (a,b)=>{
    return a >0 && b>0 ? a*b : "Give non-zero value"; 
}

const div  = (a,b)=>{
    return a>b ? a/b : b/a;
}

module.exports = {
    add ,
    sub ,
    mul,
    div
}


