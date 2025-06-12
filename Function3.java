public class Function3 {
    static boolean Ispallindrome (int arr[]){
        int flag=0;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                flag=1;
                break;
            }
        }
        if(flag==1){
        return false;
        }
        else{
           return true;

       
       }
    }
       
    public static void main(String args[]){

        int arr[]={1,2,3,2,4};
     System.out.println(Ispallindrome(arr));
}
}
