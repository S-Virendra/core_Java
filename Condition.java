import java.util.Scanner;
public class Condition {
    public static void main(String arr[]){
        //int a=1;
        Scanner obj=new Scanner(System.in);
        char a=obj.next().charAt(0);




        if(a>='A'&& a<='Z'){
            System.out.println("uppercase");
    
        }
        else if(a>='a'&& a<='z'){
            System.out.println("lowercase");

        }
        else{
            System.out.println("special");
        }

    }
    
}
