import java.util.Scanner;

class BinarySearchExample {

    static int binarySearch(int arr[], int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;          // element found

            else if (key > arr[mid])
                low = mid + 1;       // right side search

            else
                high = mid - 1;      // left side search
        }

        return -1;   // element not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        System.out.println(binarySearch(arr, key)); 

       int result=binarySearch(arr, key);
       if(result==-1){
        System.out.println("not found");

       }
       else{
        System.out.println("yes present in "+result+" "+"index");
       }
    }
}

