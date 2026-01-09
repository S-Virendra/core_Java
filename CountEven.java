import java.util.ArrayList;

public class CountEven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
 
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){                // even logic
                al.add(arr[i]);
            }
            else{
                al1.add(arr[i]);     //odd
            }
        }
        System.out.println(al.size());  //printing count of even
        int sumeven=0;
        for(int eve:al){
            sumeven=sumeven+eve;
            System.out.println(eve+" "); // printing even number
            
        }
        System.out.println("the sum of even is "+sumeven);
        System.out.println(al1.size()); // printing count of odd
        for(int odd:al1){
            System.out.print(odd+" ");// printing odd no
    }
}
}
