public class REVERSE {
    public static void main(String arr[]){
        int num=586;
        int rev=0;
        while(num!=0){
            int last=num%10;
            rev=rev*10+last;
            num=num/10;


        }
        System.out.println(rev);




    }
    
}
