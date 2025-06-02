import java.util.Scanner;

public class Revese {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = obj.nextInt(); // size lena input se

        

        System.out.println("Enter the elements of the array:");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        for(int i=0;i<array.length/2;i++){
            int temp=array[size-1-i];
            array[size-1-i]=array[i];
            array[i]=temp;
        }
        for(int i:array){
            System.out.println(i +" ");
        }
    }
}

