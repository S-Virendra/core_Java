public class Function2 {
    static int reverse(int arr[]){
        
        int temp;

        for(int i=0;i<arr.length/2;i++){
              temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;}

            for(int ind:arr){
                System.out.print(ind);
            }

            
           
        

        return 0;

    }
    public static void main(String args[]){

        int arr[]={1,2,3,4,5};
     reverse(arr);  
    }
    
}
