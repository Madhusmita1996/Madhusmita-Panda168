import java.util.Scanner;
public class PrintNumber{
   public static void main(String[] args){
      int value;
      System.out.println("Required packages have been imported");
      System.out.println("Variable to store value is defined");
      Scanner reader = new Scanner(System.in);
      System.out.println("A reader object has been defined\n");
      System.out.print("Enter a number: ");
      value = reader.nextInt();
      System.out.println("The nextInt method is used to read the number ");
      System.out.println("The number is: ");
      System.out.println(value);
   }
}