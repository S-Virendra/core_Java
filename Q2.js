let arr=[3,7,2,9,5];
let max=arr[0];
let ans;
for(let i=1;i<arr.length;i++){
    if(arr[i]>max){
    max=arr[i];
    }
}
console.log(max);