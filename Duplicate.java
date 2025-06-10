public class Duplicate {
    public static void main(String args[]){
        int arr[]={4,5,5,3,4};
        int size=arr.length;
        for(int i=0;i<size;i++){
            boolean Dup=false;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j] && arr[i]!=-1){
                    Dup=true;
                    arr[j]=-1;
                }
            }


        }for(int ind=0;ind<size;ind++){
            System.out.println(arr[ind]);
        }

        }
        
            






    }
    

