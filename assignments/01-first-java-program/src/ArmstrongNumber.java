import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the lower range of integer: ");
    int lowerRangeNumber = input.nextInt();
    System.out.print("Please enter the upper range of integer: ");
    int upperRangeNumber = input.nextInt();
    input.close();

    System.out.printf("Armstrong Number between %d and %d is: ", lowerRangeNumber, upperRangeNumber);

    for (int i = lowerRangeNumber; i < upperRangeNumber; i++) {
      // Number of digits calculation
      int temp = i;
      int digits = 0;
      while (temp != 0) {
        temp /= 10;
        digits++;
      }

      // Compute sum of nth power of its digits
      int sumOfDigits = 0;
      temp = i;
      while (temp != 0) {
        int digit = temp % 10;
        sumOfDigits += Math.pow(digit, digits);
        temp /= 10;
      }

      // Check if the number i is equal to the sum of nth power of its digits
      if (sumOfDigits == i) {
        System.out.print(i + " ");
      }
    }
  }
}
