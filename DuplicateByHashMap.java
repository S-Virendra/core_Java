import java.util.HashMap;
import java.util.Map;

public class DuplicateByHashMap {
    public static void main(String[] args) {
        int arr[]={3,5,4,3,2,2,1,3,4};
        Map<Integer,Integer>hm=new HashMap<>();

        for(int no:arr){
            Integer count = hm.get(no);
            if(count==null){
              hm.put(no,1);
            }
            else{
                count=count+1;
                hm.put(no,count);
            }
        }
        hm.forEach((key, value) -> {    // Lambda 
            if (value > 1) {
                System.out.println(key);
            }
        });
    }
    
}
