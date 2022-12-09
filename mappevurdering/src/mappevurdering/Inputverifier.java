package mappevurdering;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputverifier {
  static Scanner scanner = new Scanner(System.in);

private Inputverifier(){
  throw new UnsupportedOperationException();
}
  public static int choiceVerifier(int min, int max) {
    int choice;
    try {
      choice = Integer.parseInt(scanner.nextLine());
      if (choice < min || choice > max) {
        throw new IllegalArgumentException("The number must be between " + min + " and " + max);
      }
    } catch (NumberFormatException e) {
      throw new NumberFormatException("You must enter a number");
    }
    return choice;

  }

  public static String stringVerifier() {
    String itemNum;
    itemNum = scanner.nextLine();
    try {
      Integer.parseInt(itemNum);
      throw new IllegalArgumentException("You must enter a string");
      } catch (NumberFormatException e) {
        return itemNum;
      }
    }

    public static int integerCanBeZeroVerifier() {
      int integerCanBeZero;
      try {
        integerCanBeZero = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
        throw new NumberFormatException("You must enter a number");
      }
      if (integerCanBeZero < 0) {
        throw new IllegalArgumentException("The number must be 0 or higher");
      }
      return integerCanBeZero;
    }

  public static int integerCannotBeZeroVerifier() {
    int integerCannotBeZero;
    try {
      integerCannotBeZero = Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException e) {
      throw new NumberFormatException("You must enter a number");
    }
    if (integerCannotBeZero <= 0) {
      throw new IllegalArgumentException("The number must be higher than 0");
    }
    return integerCannotBeZero;
  }

  public static double doubleVerifier() {
    double doubleVerifier;
    try {
      doubleVerifier = Double.parseDouble(scanner.nextLine());
    } catch (NumberFormatException e) {
      throw new NumberFormatException("You must enter a number");
    }
    if (doubleVerifier <= 0) {
      throw new IllegalArgumentException("The number must be higher than 0");
    }
    return doubleVerifier;
  }




  public static void integerVerifier() {
    try {
      int integer = scanner.nextInt();
      if (integer < 0) {
        throw new IllegalArgumentException("The number must be positive");
      }
    } catch (InputMismatchException e) {
      throw new InputMismatchException();
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException();
    }
  }
}
