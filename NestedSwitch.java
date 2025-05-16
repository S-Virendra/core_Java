import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the age");

        int age=obj.nextInt();
         
        String document=obj.next();
        int age1=obj.nextInt();
       // int digit=obj.nextInt();
        switch(age){

            case 2:System.out.println("you are a baby");
            break;
            case 14:System.out.println("adolcense");
            case 18:
            switch(document){
                case "aadhar":System.out.println("yes aadhar");
                case "PAN":
                switch(age1){
                    case 40:System.out.println("senior");
                    break;
                    case 19:System.out.println("new pan holder");
                    break;
                    default:System.out.println("invalid");

                }

            }
            default:System.out.println("very bad");

        }
    
    }

























    
}
