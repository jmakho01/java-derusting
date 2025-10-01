import java.util.Map;
import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> theMap = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    theMap.put("studentA", 32);
    theMap.put("studentB", 64);
    theMap.put("studentC", 128);
    // Get the value associated with a given key in the Map
    System.out.println(theMap.get("studentB"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println(theMap.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    theMap.replace("studentA", 16);
    // Check whether the Map contains a given key
    if(theMap.containsKey("studentC") == true)
    {
      System.out.println("theMap contains key studentC!");
    }
    else
    {
      System.out.println("theMap does not contain key studentC.");
    }
    // Check whether the Map contains a given value
    if(theMap.containsValue(16) == true)
    {
      System.out.println("theMap contains value 16!");
    }
    else
    {
      System.out.println("theMap does not contain value 16.");
    }
    // Iterate over the keys of the Map, printing each key
    for(String keys : theMap.keySet())
    {
      System.out.println(keys);
    }
    // Iterate over the values of the map, printing each value
    for(Integer values : theMap.values())
    {
      System.out.println(values);
    }
    // Iterate over the entries in the map, printing each key and value
    for(String theKey : theMap.keySet())
    {
      System.out.println("Key: " + theKey);
      System.out.println("Value: " + theMap.get(theKey));
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
