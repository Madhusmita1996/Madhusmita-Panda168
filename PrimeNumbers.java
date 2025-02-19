public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; // If no factors found, it's a prime
    }

    public static void main(String[] args) {
        int N = 50; // Set the value of N to the upper limit
        System.out.println("Prime numbers from 1 to " + N + " are:");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
