

let ones=["","One","Two","THREE","Four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"]
let ty=["","","Twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"]
 
let number=6500
let result = ""
if(number>=1 && number < 10000){

    if(number>=1000){

            result= ones[parseInt(number/1000)] + " thousand "
            number%=1000
    }
    if(number>=100){
            result += ones[parseInt(number/100)] + " hundred "
            number%=100
    }
    if(number>=20){
        result += ty[parseInt(number/10)] + " "
        number%=10
    }
    if(number>=1){
        result += ones[parseInt(number)]
    }

}


console.log(result)