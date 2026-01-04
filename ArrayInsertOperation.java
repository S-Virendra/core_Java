public class ArrayInsertOperation {
    public static void main(String[] args) {
        
    
    int arr[]={10,20,30,40,50};
    int indexpos=2;
    int element=100;

    int NewArr[]=new int[arr.length+1];// one element

    for(int i=0;i<indexpos;i++){
        NewArr[i]=arr[i];   //[10,20,0,0,0,0]
    }
        NewArr[indexpos]=element; //[10,20,100,0,0,0]

        for(int j=indexpos;j<arr.length;j++){
            NewArr[j+1]=arr[j];

        }
    
    
                 
for(int no:NewArr){
        System.out.println(no+" ");
     
}
}
}

