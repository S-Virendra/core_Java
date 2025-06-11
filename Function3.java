public class Function3 {
    static void reverse(int arr[]){
       
        int i=0;
        int size=5;
         boolean flag=true;
        while(i<arr.length){
           if(arr[i]==arr[arr.length-1-i]){
             flag=false;
            System.out.println("pallindrome");
           }
           else{
            System.out.println("not");
           }
           i++;
           size--;
        }}
       
    public static void main(String args[]){

        int arr[]={1,2,3,4,5};
     reverse(arr);  
    }
    
}
