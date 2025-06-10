public class Even_odd {
    public static void main(String[]args){
    int arr[]={7,1,6,3,8,9};
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0)
        continue;
        for(int j=i+1;j<arr.length;j++){

            if(arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
    
}
}
