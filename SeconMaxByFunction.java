import java.util.Scanner;
public class SeconMaxByFunction {
         static void secondmax(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
      for(int ele:arr){
        System.out.print(ele);
      }
         }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
       secondmax(arr,size);
        
    }
    
}
