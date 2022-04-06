import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNumber = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNumber = input.nextInt();
    if (firstNumber > secondNumber) {
      System.out.println("The number " + firstNumber + " is largest number.");
      input.close();
      return;
    } else {
      System.out.println("The number " + secondNumber + " is largest number.");
      input.close();
      return;
    }
  }
}
