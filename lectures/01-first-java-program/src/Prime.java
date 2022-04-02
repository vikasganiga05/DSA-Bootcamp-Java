import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int number = input.nextInt();
    if (number <= 1) {
      System.out.println("Neither prime nor composite");
      return;
    }
    int count = 2;
    if (number == 4) {
      System.out.println("Not Prime");
      return;
    } else {
      while (count * count < number) {
        if (number % count == 0) {
          System.out.println("Not Prime");
          return;
        }
        count = count + 1;
      }
      if (count * count > number) {
        System.out.println("Prime");
        return;
      }
    }
  }
}
