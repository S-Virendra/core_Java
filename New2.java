class New2 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4};
        int smallest = findSmallest(numbers);
        int largest = findLargest(numbers);

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }

    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}
