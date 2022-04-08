import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, f1 = 0, f2 = 1;
    System.out.print("Please enter the nth value: ");
    n = input.nextInt();
    input.close();

    if (n < 1) {
      System.out.println("Not a valid nth value.");
      return;
    }

    System.out.printf("First %d fibonacci numbers are: ", n);
    System.out.print(f1 + " ");
    for (int i = 1; i < n; i++) {
      System.out.print(f2 + " ");
      int next = f1 + f2;
      f1 = f2;
      f2 = next;
    }
  }
}
