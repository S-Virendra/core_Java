public class Pattern3 {
    public static void main(String arr[]){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=9;c++){
                if(c>=r&&c<=10-r){           
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
    
}
