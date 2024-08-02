

function display(){
 
    console.log("Hello my friends")
 
}
 
 
console.log("A")
setTimeout(display,3000)
console.log("B")
//Synchronous tasks happen in order—you must complete the current task before moving on to the next.  Asynchronous tasks are executed in any order or even at once