

function ones(num){
    let words=""
        switch(num){
            case 1: words="one";break
            case 2: words="two";break
            case 3: words="three";break
            case 4: words="four";break
            case 5: words="five";break
            case 6: words="six";break
            case 7: words="seven";break
            case 8: words="eight";break
            case 9: words="nine";break
            case 10: words="ten";break
            case 11: words="eleven";break
            case 12: words="twelve";break
            case 13: words="thirteen";break
            case 14: words="forteen";break
            case 15: words="fifteen";break
            case 16: words="sixteen";break
            case 17: words="seventeen";break
            case 18: words="eighteen";break
            case 19: words="nineteen";break

        }
        return words+" "

}

function ty(num){
    let word=""

    switch(num){
        case 20: word="twenty";break
        case 30: word="thirty";break
        case 40: word="forty";break
        case 50: word="fifty";break
        case 60: word="sixty";break
        case 70: word="seventy";break
        case 80: word="eighty";break
        case 90: word="ninety";break

    }
    return word+" "
}


function convert(number){
let result=""
if (number>9999){
    console.log("invalid number")
}else{
    if(number>=1000){
        result = ones(parseInt(number/1000)) + "thousand "
        number %=1000
    }
    if(number>=100){
        result+= ones(parseInt(number/100)) + "hundred "
        number%=100
    }
    if(number>=20){
        result+= ty(parseInt(number/10)*10)
        number%=10
    }
    if(number>=1){
        result+= ones(number)
    }
}
    return(result)
}

for(let i=1;i<=1000;i++){
    console.log(convert(i))
}