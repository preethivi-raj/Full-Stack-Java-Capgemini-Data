const result = document.getElementById("result");
result.style.display = "none";

const searchInput = document.getElementById("search-input");
const form = document.getElementById("form");

let filterData 

form.addEventListener("submit", (e) => {
  e.preventDefault();
  const searchValue = searchInput.value;
  console.log(searchValue);

  const EMP_DATA = JSON.parse(localStorage.getItem("EMP_DATA"));

   filterData = EMP_DATA.filter((emp) => {
    return emp.ID === searchValue;
  });

  console.log(filterData);

  if (filterData.length > 0) {
      const emp_name = document.getElementById("emp_name");
      const emp_id = document.getElementById("emp_id");

        emp_name.innerHTML = filterData[0].NAME;
        emp_id.innerHTML = filterData[0].ID;
        result.style.display = "inline";

  } else {
    alert("Employee not found");
  }
});

const removeBtn = document.getElementById("remove-btn");

removeBtn.addEventListener("click", (e) => {
    e.preventDefault();
    const EMP_DATA = JSON.parse(localStorage.getItem("EMP_DATA"));
    const dateledEmp = EMP_DATA.filter((emp) => {
        return emp.ID !== filterData[0].ID;
    });
    localStorage.setItem("EMP_DATA", JSON.stringify(dateledEmp));
    alert("Employee removed successfully");
    window.location.reload();
}
);
