public class Pallindromestring{
static boolean rev(String str){
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        int i=0;
        int j=str.length()-1;
        while(i!=j)
        {
            if(str.charAt(i)
            i++;
            j--;
            
        }
        for(char k:arr){
            System.out.print(k);
        }
          

    }
    
    public static void main(String[] args) {
        String str="ABCDE";
        rev(str);

    }
}