public class anagram2 {
    static boolean check(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;}
            int count[]=new int[26];
            for(int i=0;i<str1.length();i++){
                count[str1.charAt(i)-'a']++;
                count[str2.charAt(i)-'a']--;
            }
            for(int i=0;i<26;i++){
                if(count[i]!=0) return false;
            }
            return true;
        
    }
    public static void main(String args[] ){

        String str1="abcde";
        String str2="edcba";
       System.out.println( check(str1,str2));
    }
    
}
