const mainContent = document.body.querySelector("#main");

const search = document.body.querySelector("#search");

const datas = JSON.parse(localStorage.getItem("datas")) || [];

console.log(datas)

search.addEventListener("change", () => {
    const searchWord = search.value;

    mainContent.innerHTML = "";
    const filteredData = datas.filter((data) =>
        data.title.toLowerCase().includes(searchWord.toLowerCase())
    );

    console.log(filteredData)

    if (filteredData.length > 0) {
        filteredData.forEach((data) => {
            const foodDiv = document.createElement("div");

            foodDiv.innerHTML = `<div class="card bg-base-100  w-80 h-96 shadow-xl">
                                    <figure  >
                                        <img
                                        src="https://loremflickr.com/g/500/500/food"
                                        class ="h-46"
                                        alt="food" />
                                    </figure>
                                    <div class="card-body">
                                        <h2 class="card-title">${data.title}</h2>
                                        <p>${data.details.length>=50 ? `${data.details.substring(0,50)}.....` : data.details}</p>
                                        <div class="card-actions justify-end">
                                        <button class="btn btn-primary">Add Cart</button>
                                        </div>
                                    </div>
                                    </div>`

             mainContent.appendChild(foodDiv)                       
        });   
    } else {
        mainContent.innerHTML = `<p class="text-center text-2xl color-red-9000"  > No Data Found</p>`;
    }
});

datas.forEach((data)=>{
    const foodDiv =  document.createElement("div")

    foodDiv.innerHTML = `<div class="card bg-base-100  w-80 h-96 shadow-xl">
                                    <figure  >
                                        <img
                                        src="https://loremflickr.com/g/500/500/food"
                                        class ="h-46"
                                        alt="food" />
                                    </figure>
                                    <div class="card-body">
                                        <h2 class="card-title">${data.title}</h2>
                                        <p>${data.details.length>=50 ? `${data.details.substring(0,50)}.....` : data.details}</p>
                                        <div class="card-actions justify-end">
                                        <button class="btn btn-primary">Add Cart</button>
                                        </div>
                                    </div>
                                    </div>`;

             mainContent.appendChild(foodDiv) 
})


