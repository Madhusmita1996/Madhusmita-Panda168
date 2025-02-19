import java.util.Scanner;
public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            // Inner loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
