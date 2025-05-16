import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            result=result+result*i;

        }
        System.out.println(result);
    }
    
}
