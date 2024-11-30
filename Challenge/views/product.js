const productForm = document.getElementById("searchForm");
const productList = document.getElementById("productList");

productForm.addEventListener("submit", async (event) => {
  event.preventDefault();
  productList.innerHTML = "";
  const name = document.getElementById("name").value;
  const category = document.getElementById("category").value;

  let url = "";
  if (name) {
    url = name;
  } else if (category) {
    url = `category/${category}`;
  } else {
    url = "all/getAll";
  }

  try {
    console.log(url);
    const res = await fetch(`http://localhost:3000/api/admin/${url}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    });
    const data = await res.json();
    console.log(data);

    data.forEach((product) => {
      const productCard = document.createElement("div");
      productCard.style.marginBottom = "10px";
      productCard.innerHTML = `
             <p> <strong>Product : ${product._id}</strong>  </p>
             <p> <strong>Name:</strong> ${product.name} </p>
             <p> <strong>Price:</strong> ${product.price} </p>
             <p> <strong>Category:</strong> ${product.category} </p>
             <p> <strong>Manufacturing Date:</strong> ${product.manufacturingDate} </p>
             <p> <strong>Expiry Date:</strong> ${product.expiryDate} </p>
              <hr>
            `;
      productList.appendChild(productCard);
    });
  } catch (error) {
    alert(error.message);
  }
});
