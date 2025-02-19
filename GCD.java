public class GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b; 
            a = b;  
            b = remainder; 
        }
        return a; 
    }

    public static void main(String[] args) {
        int num1 = 56; 
        int num2 = 98; 
        int gcd = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
