

let day = 9

switch(day){

    case 1:
    case 2: console.log("take backups") ; break
    case 5:
    case 3: console.log("do fresh installations") ; break
    case 6: 
    case 4: console.log("change passwords") ; break
    
    default:
        console.log("we do not have more than 6 or less than 6 days")

}