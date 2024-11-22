const fun1 = (callback)=>{
    setTimeout(()=>{
        console.log("Fun 1")
        callback()
    } , 1000)
}

const fun2 = (callback)=>{
    setTimeout(()=>{
        console.log("Fun 2")
        callback()
    },3000)
    
}

const fun3  = (callback)=>{
    setTimeout(()=>{
        console.log("Fun 3")
        callback()
    },2000)
}

fun1(async()=>{
    fun2(()=>{
        fun3(()=>{
            console.log("All fun called");
        })
    })
})