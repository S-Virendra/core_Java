public class Function1 {
    static int sum(int arr[]){
        int ans=0;

        for(int i=0;i<arr.length;i++){
            ans=ans+arr[i];

            
           
        }

        return ans;

    }
    public static void main(String args[]){

        int arr[]={1,2,3,4,5};
      System.out.println(sum(arr));  
    }
    
}
