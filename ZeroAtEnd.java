public class ZeroAtEnd {
    public static void main(String args[]){
        int arr[]={1,0,2,3,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[n-1]=arr[i];
            }
            System.out.println(arr[i]);
        }






    }
    
}
