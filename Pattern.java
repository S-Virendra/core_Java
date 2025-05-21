/*public class Pattern {
    public static void main(String arr[]){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=5;c++){
                if(c>=r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
    
}*/
public class Pattern {
    public static void main(String arr[]){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=5;c++){
                if(c<=r){           /// =>left triangle and if c<6-r => inverted right || c<=r => right triangle and if c>=r =>left inverted triangle
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
