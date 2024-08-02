


let marks=230
let per=marks*100/500

console.log("percentage:", per)
console.log("---------------")

if(per>=90){
    console.log("grade: A+")
}


if(per>=80 && per<90){
    console.log("grade: A")
}

if(per>=70 && per<80){
    console.log("grade: B")
}

if(per>=60 && per<70){
    console.log("grade: C")
}

if(per<60){
    console.log("You Have Failed")
}