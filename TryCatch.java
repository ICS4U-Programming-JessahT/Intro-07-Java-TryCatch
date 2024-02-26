import java.util.Scanner;

/**
 * Getting user input to calculate the volume of a sphere with try catch.
 *
 * @author Jessah
 * @version 1.0
 * @since 2024-02-26
 */
public final class TryCatch {
  /** Private constructor to prevent instantiation of this utility class. */
  private TryCatch() {
    // whitespace
  }

  /**
  * Print message.
  *
  * @param args Command-line arguments (not used in program).
  */
  public static void main(final String[] args) {

    try {
      // Get user input.
      System.out.print("Enter a radius for volume of sphere: ");
      final Scanner input = new Scanner(System.in);
      final String userNumString = input.nextLine();

      // Convert string to double.
      final double userNum = Double.parseDouble(userNumString);

      // use if else statements to check if user can vote
      if (userNum >= 1) {
        // Output for right value.
        final double sphVol = (4d / 3d) * (Math.PI) * (Math.pow(userNum, 3));
        System.out.print("The volume of a circle with the radius of ");
        System.out.print(userNum + " is ");
        System.out.format("%.3f", sphVol);
        System.out.println();

      } else {
        // Output for incorrect value.
        System.out.println(userNum + " is invalid");
        System.out.println("because it cannot be zero or negative.");
      }
      input.close();
    } catch (NumberFormatException error) {
      // For any string input.
      System.out.println("This input is invalid " + error.getMessage());
      System.out.println();
    }

  }
}
