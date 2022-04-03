import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your number: ");
    int number = input.nextInt();
    if (number % 2 == 0) {
      System.out.println("The number " + number + " is Even.");
      return;
    } else {
      System.out.println("The number " + number + " is Odd.");
      return;
    }
    input.close();
  }
}
