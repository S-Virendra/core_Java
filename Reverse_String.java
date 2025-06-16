public class Reverse_String {

     static void rev(String str){
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        int i=0;
        int j=str.length()-1;
        while(i!=j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
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
