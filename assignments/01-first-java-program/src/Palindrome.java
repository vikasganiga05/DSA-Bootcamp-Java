import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the string: ");
    String str = input.nextLine();
    input.close();

    int i = 0;
    int j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) == str.charAt(j)) {
        i++;
        j--;
      } else {
        System.out.printf("The string %s is not a Palindrome. \n", str);
        return;
      }
    }
    System.out.printf("The string %s is a Palindrome. \n", str);
  }
}
