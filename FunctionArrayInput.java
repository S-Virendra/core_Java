import java.util.Scanner;
public class FunctionArrayInput {



    static void inputArray(int arr[],int size){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size pf array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        inputArray(arr,size);

    }
    
}
