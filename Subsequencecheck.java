public class Subsequencecheck {

    public static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++; // move in s1
            }
            j++; // always move in s2
        }

        return i == s1.length(); // if all characters of s1 were matched
    }

    public static void main(String[] args) {
        String s1 = "z";
        String s2 = "a1b2c3";

     System.out.println( isSubsequence(s1, s2));
    }
}

    

