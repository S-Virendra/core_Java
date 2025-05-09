import java.util.Scanner;
public class Switch {
    public static void main(String arr[]){
        System.out.println("enter the day");
        Scanner obj=new Scanner(System.in);
        int day=obj.nextInt();
        switch(day){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:case 4:
            System.out.println("wednesday");
            break;
          /*   case 4:
            System.out.println("thursday");
            break;*/
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break; 
            default:
            System.out.println("enter valid day");
        }



    }
    
}
