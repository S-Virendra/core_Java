import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);


        int a=obj.nextInt();
        int b=obj.nextInt();
        int res=1;
        for(int i=1;i<=b;i++){
            res=res*a;


        }
        System.out.println(res);
        
    }
    
}
