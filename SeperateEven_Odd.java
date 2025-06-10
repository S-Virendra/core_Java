
public class SeperateEven_Odd{
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
       
         int i = 0, j = arr.length - 1;

        while (i < j) {
            while (arr[i] % 2 == 0 && i< j)
                i++;
            while (arr[j] % 2 == 1 && i < j)
                j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
       
    }
}