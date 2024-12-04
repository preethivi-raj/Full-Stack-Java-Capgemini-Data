
const emiCalculator  = (loan_ammount , rate_of_interest , no_of_month)=>{
   try {
        const monthly_interest = rate_of_interest/12/100;
        let emi  = (loan_ammount *monthly_interest * Math.pow(1+monthly_interest ,  no_of_month))/(Math.pow(1+monthly_interest , no_of_month)-1)
        return Math.floor(emi);
   } catch (error) {
    console.log(`Error in getLoanOffer Controller ; ${error}`)
    res.status(500).json({
        message : "Error in getLoanOffer Controller"
    })
   }
}

export default emiCalculator;