public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

/*        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }*/

        System.out.println("\n\nArray after removing duplicates:");
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            // Check if arr[i] has appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            // Print only if it's not a duplicate
            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

    

