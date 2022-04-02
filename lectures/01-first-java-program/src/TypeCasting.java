import java.util.Scanner;

public class TypeCasting {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // float num = input.nextFloat();
    // int num = input.nextInt();
    // System.out.println(num);

    /* Type Casting */
    // int num = (int)(98.67F);
    // System.out.println(num);

    /* Automatic type promotion in expressions */
    // int a = 257;
    // byte b = (byte)(a); // 257 % 256 = 1
    // System.out.println(b);

    // byte a = 40;
    // byte b = 50;
    // byte c = 100;
    // int d = a * b / c;
    // System.out.println(d);

    // byte a = 50;
    // a = a * 2;

    // int number = 'A';
    // System.out.println(number);

    /*
      Automatic type promotion in expressions.
        Rules:
          1. All the byte, short and charecter values are promoted to integer.
          2. If any one of the operands is long the whole operation will be promoted to long.
    */
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67F;
    double d = 0.1234;
    double result = (f * b) + (i / c) - (d * s);
    // float + int - double = double
    System.out.println((f * b) + " " + (i / c) + " " + (d * s));
    System.out.println(result);
  }
}
