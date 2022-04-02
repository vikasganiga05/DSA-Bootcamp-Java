import java.util.Scanner;

public class SumOfTwoNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int firstNumber = input.nextInt();
    System.out.print("Enter the second number: ");
    int secondNumber = input.nextInt();
    int sum = firstNumber + secondNumber;
    System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    input.close();
  }
}
