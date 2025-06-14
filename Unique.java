import java.util.*;
public class Unique {
    



    static int findUnique(int[] arr) {
        int n = arr.length;

        // Iterate over every element
        for (int i = 0; i < n; i++) {

            // Initialize count to 0
            int count = 0;

            for (int j = 0; j < n; j++) {

                // Count the frequency of the element
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If the frequency of the element is one
            if (count == 1) {
                return arr[i];
            }
        }

        // If no element exists at most once
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findUnique(arr));
    }
}

