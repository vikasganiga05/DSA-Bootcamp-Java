import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter principal amount: ");
    double principleAmount = input.nextDouble();
    System.out.print("Enter rate: ");
    double rate = input.nextDouble();
    System.out.print("Enter time: ");
    double time = input.nextDouble();
    input.close();

    double simpleInterest = (principleAmount * rate * time) / 100;

    System.out.printf("Simple Interest is: %.2f \n", simpleInterest);
  }
}
