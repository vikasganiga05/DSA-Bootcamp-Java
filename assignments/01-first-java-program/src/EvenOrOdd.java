import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your number: ");
    int number = input.nextInt();
    if (number % 2 == 0) {
      System.out.printf("The number %d is Even. \n", number);
      return;
    } else {
      System.out.printf("The number %d is Odd. \n", number);
      return;
    }
  }
}
