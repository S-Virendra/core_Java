public class Right {
    public static void main(String arr[]){
         char a='a';
        for(int r=1;r<=5;r++){
            for(int c=1;c<=5;c++){
                if(c<=r){           
                    System.out.print(a++);/// print(c) 
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
    
}
