public class Pallind {
    public static void main(String[] args) {
          int num=141;
    int rev=0;
    int res=num;
    while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;

    }
     if(rev==res){
       System.out.println("palli");
     }
     else {System.out.println("not");
       
     }

}
    }
    

