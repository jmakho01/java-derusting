import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String theString = "Waddle";
    // Find the length of the string
    System.out.println("theString length: " + theString.length());
    // Concatenate (add) two strings together and reassign the result
    theString = theString + " Dee";
    System.out.println(theString);
    // Find the value of the character at index 3
    System.out.println("The value of the character at index 3 for theString is: " + theString.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if(theString.contains("dd"))
    {
      System.out.println("theString contains the substring 'dd'!");
    }
    else
    {
      System.out.println("theString does not contains the substring 'dd'.");
    }
    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < theString.length(); i++)
    {
      System.out.println(theString.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> arrList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    arrList.add("Kirby");
    arrList.add(theString);
    arrList.add("Meta Knight");
    arrList.add("King Dedede");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(", ", arrList);
    System.out.println(joinedString);
    // Check whether two strings are equal
    if(arrList.get(0).equals("Keeby") == true)
    {
      System.out.println("The strings are equal!");
    }
    else
    {
      System.out.println("The strings are not equal.");
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
