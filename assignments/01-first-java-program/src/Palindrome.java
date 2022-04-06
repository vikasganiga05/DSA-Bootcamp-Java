import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the string: ");
    String str = input.nextLine();
    int i = 0;
    int j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) == str.charAt(j)) {
        i++;
        j--;
      } else {
        System.out.println("The string " + str +" is not a Palindrome.");
        input.close();
        return;
      }
    }
    System.out.println("The string " + str + " is a Palindrome");
    input.close();
  }
}
