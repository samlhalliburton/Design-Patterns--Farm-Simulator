import java.util.Scanner;

public class HelloWorld {

  static boolean output;

  static void setValueGreaterThanZero(int x) {
    if(x > 0) {
      output = true;
    } else if(x <= 0) {
      output = false;
    } else if(x == 0) {
      output = false;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello World!");
    System.out.println("Enter a number to test:");
    int input = scanner.nextInt();

    setValueGreaterThanZero(input);
    System.out.println("Is input greater than zero? " + output);

  }

}
