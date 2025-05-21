public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int sum=0;
        int org=num;

        while(num!=0){
            int dig=num%10;
            sum=sum+dig*dig*dig;
            num=num/10;



        }
        if(sum==org){
            System.out.println("arms");
        }
        else{
            System.out.println("no arms");
        }






    }
    
}
