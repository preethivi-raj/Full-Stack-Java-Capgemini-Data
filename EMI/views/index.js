const form = document.getElementById("form");
const monthly_salary = document.getElementById("monthly_salary");
const loan_amount = document.getElementById("loan_amount");
const emi_month =  document.getElementById("emi_month");
const selectTag = document.getElementById("select_tag");
const answer  = document.getElementById("answer");

form.addEventListener("submit", async (e) => {
    e.preventDefault();
    let content_data = {};
    try {
        
        const res = await fetch("https://full-stack-java-capgemini-data-1.onrender.com/api/emi", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                monthly_sal: monthly_salary.value,
                loan_ammount: loan_amount.value,
                loan_type: selectTag.value,
                no_of_month: emi_month.value
            })
        });

        if (!res.ok) {
             
            throw new Error(await res.text());
        }
        const data = await res.json();
        content_data = data;  

    } catch (error) {
        
        console.error("Error in fetch method", error);
        answer.innerHTML = `<p class='error text-red-900 text-2xl'>Error: ${error.message}</p>`;
        return; 
    }


    if (content_data.emiPerMonth && content_data.totalEmi && content_data.no_of_month) {
        answer.innerHTML = `
            <p class="m-4"><strong>EMI per month:</strong> ₹${content_data.emiPerMonth}</p>
            <p class="m-4"><strong>Total EMI:</strong> ₹${content_data.totalEmi}</p>
            <p class="m-4"><strong>Loan Tenure (Months):</strong> ${content_data.no_of_month}</p>
        `;
    } else {
        answer.innerHTML = `<p class='error'>Received data is incomplete or invalid.</p>`;
    }
});
