import java.util.Scanner;

public class InrToUsd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the amout in rupees(INR): ");
    double rupees = input.nextDouble();
    input.close();
    double dollars = rupees / 75.91;
    System.out.printf("Rs %.2f in USD is equals to $%.2f \n", rupees, dollars);
  }
}
