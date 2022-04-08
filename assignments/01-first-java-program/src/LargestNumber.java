import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNumber = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNumber = input.nextInt();
    input.close();

    if (firstNumber > secondNumber) {
      System.out.printf("The number %d is largest number. \n", firstNumber);
      return;
    } else {
      System.out.printf("The number %d is largest number. \n", secondNumber);
      return;
    }
  }
}
