import java.util.Scanner;
public class LinearSearch_Function {
     
    static int fact(int num){

        int res=1;
        for(int i=1;i<=num;i++){
         res=res*i;
        }
       
        return res;
    }
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.print("enter number:");
     int num=sc.nextInt();
      
     System.out.println("Answer is:"+fact(num));

        
    }
    
}
