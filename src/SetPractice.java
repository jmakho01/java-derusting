import java.util.Set;
import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> theSet = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    theSet.add("Wolfgang");
    theSet.add("Bob");
    theSet.add("Joey");
    // Check whether the Set contains a given String
    if(theSet.contains("Bob"))
    {
      System.out.println("theSet contains Bob!");
    }
    else
    {
      System.out.println("theSet does not contain Bob");
    }
    // Remove an element from the Set
    theSet.remove("Bob");
    // Get the size of the Set
    System.out.println("theSet size: " + theSet.size());
    // Iterate over the elements of the Set, printing each one on a separate line
    for(String name : theSet)
    {
      System.out.println(name);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
