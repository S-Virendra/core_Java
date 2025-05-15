import java.util.Scanner;
public class Switch1 {
    public static void main(String arr[]){
        Scanner obj=new Scanner(System.in);
        int choice=obj.nextInt();

        switch(choice){
            case 1:{
                 System.out.println("one");
                 break;

            }
           
            
            
             case 2:{
             System.out.println("two");
            
             }
             break;
             default:{
                System.out.println("invalid");
             }




        }
        



    }
    
}
