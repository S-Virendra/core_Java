import java.util.Scanner;
public class Fair {
    public static void main(String arr[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your choice default or choice");
        String choice=obj.next();//stringpool-assign value   heap me adress compare hoga
         int rental=1000;
        if(choice.equals("default")){
           
            System.out.println(rental*50);
        }
        else if(choice.equals("maruti")){
            System.out.println(rental);

        }
        








    }
    
}
