import java.util.Scanner;

public class Greeting {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String name = input.nextLine();
    input.close();
    System.out.printf("Hello %s, have a good day. \n", name);
  }
}
