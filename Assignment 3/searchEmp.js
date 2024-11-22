const searchInput = document.getElementById("search-input");
const form = document.getElementById("form");
const result = document.getElementById("result");



form.addEventListener("submit", (e) => {
  e.preventDefault();
  const searchValue = searchInput.value;
  console.log(searchValue);

  const EMP_DATA = JSON.parse(localStorage.getItem("EMP_DATA"));

   const filterData = EMP_DATA.filter((emp) => {
    return emp.ID === searchValue;
  });

  console.log(filterData);



  if(filterData.length > 0) {

    const exprerience = new Date(filterData[0].DATE).getFullYear();
    const date = new Date();
    const currentYear = date.getFullYear();
    const empExperience = currentYear - exprerience;
    console.log(empExperience);
    result.innerHTML = `
      <ul class="list-group">
        <li class="list-group-item">ID: ${filterData[0].ID}</li>
        <li class="list-group-item">Name: ${filterData[0].NAME}</li>
        <li class="list-group
        -item">SKILL: ${filterData[0].SKILLS}</li>
        <li class="list-group-item">Designation: ${filterData[0].DEPT}</li>
        </ul>
    `;
    } else {
        result.innerHTML = "<h3>Employee not found</h3>";
    }
});