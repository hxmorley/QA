
function processData(records){
    console.log(records)
}
function processResponse(res){

    let dataPromise = res.json()
    dataPromise.then(processData)
}

let promise = fetch("https://jsonplaceholder.typicode.com/posts/1/comments")

promise.then(processResponse)