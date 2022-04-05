import java.util.Scanner;

public class InrToUsd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the amout in rupees(INR): ");
    double rupees = input.nextDouble();
    double dollars = rupees / 75.45;
    System.out.println("Rs " + rupees + " in USD is equals to $" + dollars);
  }
}
