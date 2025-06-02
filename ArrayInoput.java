import java.util.Scanner;

public class ArrayInoput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = obj.nextInt(); // size lena input se

        

        System.out.println("Enter the elements of the array:");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
      
    }
}
