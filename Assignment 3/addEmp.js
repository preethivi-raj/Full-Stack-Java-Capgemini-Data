const empName = document.getElementById("name");
const id = document.getElementById("id");
const skills = document.getElementById("skills");
const date = document.getElementById("date");
const department = document.getElementById("department");

const form = document.getElementById("form");

form.addEventListener("submit", (event) => {
    event.preventDefault()
  const emp_name = empName.value;
  const emp_id = id.value;
  const emp_skills_string = skills.value;
  const emp_skills_array = emp_skills_string.split(",");
  const emp_date = date.value;
  const emp_dept = department.value;

  const emp_details = {
    NAME : emp_name ,
    ID  : emp_id,
    SKILLS : emp_skills_array , 
    DATE :  emp_date ,
    DEPT : emp_dept
  }

  const EMP_DATA = JSON.parse(localStorage.getItem("EMP_DATA"));

  if(EMP_DATA){
    const EMP_DATA = JSON.parse(localStorage.getItem("EMP_DATA")) || [];
    EMP_DATA.push(emp_details)
    localStorage.setItem("EMP_DATA" ,JSON.stringify(EMP_DATA))

  }
  else{
    localStorage.setItem("EMP_DATA",JSON.stringify([emp_details]))
  }

  alert("Employee added successfully");
  window.location.reload();
  
});
