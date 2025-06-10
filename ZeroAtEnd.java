public class ZeroAtEnd {
    public static void main(String args[]){
        int arr[]={1,0,2,3,5};
        int n=arr.length;
        int j =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
               arr[j]=arr[i];
               j++;
            }
          
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }
        for(int ind=0;ind<n;ind++){
            System.out.print(arr[ind]+" ");
        }






    }
    
}
