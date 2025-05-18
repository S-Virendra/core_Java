public class Hcf {
    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        int number1 = 48;
        int number2 = 18;
        int hcf = findHCF(number1, number2);
        System.out.println("The HCF of " + number1 + " and " + number2 + " is: " + hcf);
    }
}
