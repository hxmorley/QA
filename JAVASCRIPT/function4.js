

function tax(salary){

    let mytax = salary *0.20
    
    return mytax

}


for(let i=1000;i<=10000;i+=100){
    
    console.log("the tax calculated on",i,"is",tax(i))

}