const token = JSON.parse(localStorage.getItem("token"));

if (token.userRole !== "admin") {
  alert("You are not authorized to view this page");
  window.location.href = "login.html";
}

const productForm = document.getElementById("productForm");

productForm.addEventListener("submit", async (event) => {
  event.preventDefault();

  const name = document.getElementById("name").value;
  const price = document.getElementById("price").value;
  const category = document.getElementById("category").value;
  const manufacturingDate = document.getElementById("manufacturingDate").value;
  const expiryDate = document.getElementById("expiryDate").value;

  if (new Date(expiryDate) <= new Date(manufacturingDate)) {
    alert("Expiry date must be after the manufacturing date.");
    return;
  }

  try {
    const res = await fetch("http://localhost:3000/api/admin/add", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        name,
        price,
        category,
        manufacturingDate,
        expiryDate,
      }),
    });
    const data = await res.json();

    if (res.ok) {
      alert(data.message);
    } else {
      alert(data.message);
    }
  } catch (error) {
    alert("Error connecting to server");
  }
});
