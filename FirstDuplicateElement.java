import java.util.HashSet;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,6,3};
        int temp=-1;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=arr.length-1;i>=0;i--){
            

            if(hs.contains(arr[i])){
                temp=i;
            }
            else{
                hs.add(arr[i]);
            }
        } 
        if(temp!=-1){
            System.out.println(arr[temp]);
        }
    }
}
