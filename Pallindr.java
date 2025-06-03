import java.util.Scanner;

public class Pallindr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

       /* System.out.print("Enter the size of the array: ");*/
        int size = 5;
        

       // System.out.println("Enter the elements of the array:");
        //int array[] = new int[size];
        int array[]={1,2,3,2,1};
       // for (int i = 0; i < size; i++) {
           // array[i] = obj.nextInt();
        //}

       // for(int i=0;i<array.length/2;i++){
           /*  int temp=array[size-1-i];
            array[size-1-i]=array[i];
            array[i]=temp;*/  // using flag we cn solve it;
        
        int i=0;
         boolean flag=true;
        while(i<size){
           if(array[i]==array[size-1-i]){
             flag=false;
            System.out.println("pallindrome");
           }
           else{
            System.out.println("not");
           }
           i++;
           size--;
        }}}
       
    

