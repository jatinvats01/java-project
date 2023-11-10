import java.util.Scanner;

class FloatInput {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a float: ");

    float number = input.nextFloat();

    input.close();

    System.out.println("You entered: " + number);
  }
}
