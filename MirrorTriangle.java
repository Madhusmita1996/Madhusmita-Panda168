import java.util.Scanner;
public class MirrorTriangle{
   public static void main(String args[]){
      int i, j, k, my_input;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number of rows : ");
      my_input = my_scanner.nextInt();
      System.out.println("The Mirror Lower Star Triangle pattern : ");
      for (i = 1; i <= my_input; i++) {
         for (j = 1; j < i; j++) {
            System.out.print(" ");
         }
         for (j = i; j <= my_input; j++) {
            System.out.print("*" + " ");
         }
         System.out.println();
      }
      for (i = my_input - 1; i >= 0; i--) {
         for (j = 0; j < i; j++) {
            System.out.print(" ");
         }
         for (j = i; j <= my_input - 1; j++) {
            System.out.print("*" + " ");
         }
         System.out.println();
      }
   }
}