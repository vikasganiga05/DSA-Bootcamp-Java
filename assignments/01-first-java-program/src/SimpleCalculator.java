import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double firstNumber = input.nextDouble();
    System.out.print("Enter second number: ");
    double secondNumber = input.nextDouble();
    System.out.print("Enter operator (+, -, *, /): ");
    String operator = input.next();

    if (operator.equals("+")) {
      System.out.println("Result is: " + (firstNumber + secondNumber));
    } else if (operator.equals("-")) {
      System.out.println("Result is: " + (firstNumber - secondNumber));
    } else if (operator.equals("*")) {
      System.out.println("Result is: " + (firstNumber * secondNumber));
    } else if (operator.equals("/")) {
      System.out.println("Result is: " + (firstNumber / secondNumber));
    } else {
      System.out.println("Invalid Operator");
    }

    input.close();
  }
}
