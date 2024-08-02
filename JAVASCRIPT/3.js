
let physics = 40
let chemistry = 90
let maths = 70

let results = physics + chemistry + maths
let percentage = results * 100/450

console.log("Morley obtained:", results)
console.log("percentage:",percentage)

if(percentage>=60){
    console.log("you have PASSED the exam")}

    if(percentage<60){
        console.log("you have FAILED the exam")
    }