
public class Lcm {
    public static void main(String[] args) {
        int a=15;
        int b=25;
        int ans=(a>b)?a:b;
        while(true){
          if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
      System.out.println(ans);
       
        
        
        
    }
    
}
