public class MaxDigit {
    public static void main(String[] args) {
        int num=142;
        int max=0;
        while(num!=0){
            int dig=num%10;
            num=num/10;
            if(dig>max){
                max=dig;
            }


        }
        System.out.println(max);

    }
    
}// convert it to one two three four use krna pdega switch
