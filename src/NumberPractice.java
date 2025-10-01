public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    double negValue = -1.23;
    System.out.println("Negative float: " + negValue);
    // Create an int with a positive value and assign it to a variable
    int posValue = 4;
    System.out.println("Positive integer: " + posValue);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    double remainValue = posValue % (3 * 1.0);
    System.out.println("Remainder: " + remainValue);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if(posValue % 2 == 0)
    {
      System.out.println(posValue + " is even!");
    }
    else
    {
      System.out.println(posValue + " is odd!");
    }
    // Divide the number by another number using integer division
    int intDiv = posValue / 4;
    System.out.println("Value: " + intDiv);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
