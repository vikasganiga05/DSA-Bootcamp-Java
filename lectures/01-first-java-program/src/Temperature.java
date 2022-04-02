import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Prime enter temperature in Celsius: ");
    float tempInCelsius = input.nextFloat();
    float tempInFahrenheit = (tempInCelsius * 9/5) + 32;
    System.out.println("Temperature in Fahrenheit is " + tempInFahrenheit);
  }
}
