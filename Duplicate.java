public class Duplicate {
    public static void main(String args[]){
        int arr[]={4,5,5,3,3,4,5,6};
        int size=arr.length;
        for(int i=0;i<size;i++){
            boolean dup=false;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j] && arr[i]!=-1){
                    dup=true;
                    arr[j]=-1;
                }
            }
          if(!dup){
            System.out.println(arr[i]);
          }

        }
        }
        

        

        }
        
            






    
    

