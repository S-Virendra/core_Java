import java.util.HashSet;
import java.util.Set;

public class DuplicateBySetInterface {
    public static void main(String[] args) {
        int arr[]={3,5,4,3,2,2,1};
        Set<Integer>s=new HashSet<>();

        for(int no:arr){
            boolean b=s.add(no);
            if(b==false){
                System.out.println(no);
            }
        }
    }
    
}
