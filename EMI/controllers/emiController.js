import emiCalculator  from "../utils/emi_calculator.js";

export const getLoanOffer  = async (req , res)=>{
    try {
        const {monthly_sal , loan_ammount ,loan_type , no_of_month} = req.body;

        if(!monthly_sal || !loan_ammount || !loan_type || !no_of_month){
            return res.status(400).json({
                message  :"Please enter all the values"
            })
        }

        let loan_intrest = 0;
        switch(loan_type) {
            case "Personal" : 
                loan_intrest = 18; 
                break;
            case "Home" : 
                 loan_intrest = 9;
                 break;
            case "Car" :
                 loan_intrest = 14;
                 break;
            default : 
               return res.status(400).json({
                message : "Please Enter the valid loan type"
               })               
        }

        const emi  =emiCalculator(loan_ammount , loan_intrest ,no_of_month);

        const maxEmi = 0.5 * monthly_sal;

        const totalEmi = Math.floor(emi * no_of_month);

        res.status(200).json({
            emiPerMonth : emi ,
            totalEmi  : totalEmi ,
            no_of_month : no_of_month
        })
    } catch (error) {
        console.log(`Error in getLoanOffer Controller : ${error}`)
        res.status(500).json({
            message : "Error in getLoanOffer Controller"
        })
    }
}
