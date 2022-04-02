import java.util.Scanner;

public class Inputs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your roll no: ");
    int rollno = input.nextInt();
    System.out.print("Enter your first name: ");
    String firstName = input.next();
    System.out.print("Enter your last name: ");
    String lastName = input.next();
    System.out.println("Your roll no is " + rollno);
    System.out.println("Your name is " + firstName + " " + lastName);
    input.close();
  }
}
