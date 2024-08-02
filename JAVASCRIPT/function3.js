

function payslip(name,salary){
    console.log("name of employee:",name)
    console.log("salary:",salary)
    console.log("--------------------")
    if(salary<=1000){
        console.log("tax calculated is:",salary*0.15)
        console.log("net salary is:", salary*0.85)
        console.log("-------------------")
    }
        else{
            console.log("tax calulated is:", salary*0.20)
            console.log("net salary is:", salary*0.8)
            console.log("-------------------")
        }
}

payslip("Morley","900")