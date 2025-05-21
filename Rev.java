public class Rev {
    public static void main(String[] args) {
        int num=151;
        int rev=0;
        int org=num;
        while(num!=0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
           


        }
        if(rev==num){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not palli");
        }
       // System.out.println(rev);

    }
    
}
