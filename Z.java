import java.util.Scanner;
public class Z {
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int pass=40;
        float percentage=((a+b+c)/3);
       // System.out.println(percentage);

       if(percentage>80&& percentage<=100){
        System.out.println("A");
       }
       else if(percentage>80&&percentage<=60){
        System.out.println("B");
       }
       else if(percentage>=40&&percentage<60){
        System.out.println("C");
       }
       else{
        System.out.println("fail");
       }


    }
    
}
// question is that if anyone comes to category of supplementry then print it otherwise fail if it under 40;
