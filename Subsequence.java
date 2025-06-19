/*public class Subsequence {
    static boolean check(String str1,String  str2){
        int count=0;
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        for(int i=0;i<str1.length() && count <str2.length();i++){
            if(arr1[i]==arr2[count]){
                count++;


                 
 
 
            }
        
         
         
         }
         return true;
         
        }*/
       /*  public class Subsequence {

     static boolean isSubsequence(String s1, String s2) {
        int index = 0;
        char arr2[]=s2.toCharArray();
         char arr1[]=s1.toCharArray();

        // Go through each character in s2
        for (int i = 0; i < s2.length() && index < s1.length(); i++) {
            if (arr2[i] == arr1[index]) {
                index++;  // move to next character in s1
            }
        }

        // If we matched all characters of s1
        return index == s1.length();
    }

    public static void main(String[] args) {
        String s1 = "q";
        String s2 = "ac";

        if (isSubsequence(s1, s2)) {
            System.out.println(s1 + " is a subsequence of " + s2);
        } else {
            System.out.println(s1 + " is NOT a subsequence of " + s2);
        }
    }
}*/

    



    
   /*  public static void main(String[] args) {
        String str1="abcde";
        String str2="z";
       if(check(str1, str2)){
        System.out.println("yes");
       }
       else{
        System.out.println("no");
       }

    }
    
}*/



import java.util.Scanner;

public class Subsequence {

    public static boolean isSubsequence(String s1, String s2) {
        int index = 0;

        for (int i = 0; i < s2.length() && index < s1.length(); i++) {
            if (s2.charAt(i) == s1.charAt(index)) {
                index++;
            }
        }

        return index == s1.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        // Print only true or false
        System.out.println(isSubsequence(s1, s2));

        scanner.close();
    }
}
