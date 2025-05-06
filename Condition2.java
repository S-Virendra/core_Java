import java.util.Scanner;
public class Condition2 {
    public static void main(String arr[]){

Scanner sc=new Scanner(System.in);

System.out.println("enter meter reading: ");
int reading=sc.nextInt();
 if(reading>0&&reading<=50){
    System.out.println(reading*10);
 }
 else if(reading>50&&reading<=100){
    System.out.println(50*10+(reading-50)*20);

 }
 else if(reading>100&&reading<150){
    System.out.println("30RS/unit");

 }
 else if(reading>150&&reading<200){
    System.out.println(reading*10);    
    }
    else if(reading>200){
        System.out.println(reading*50);
    }
    
}
}
