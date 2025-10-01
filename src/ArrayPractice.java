public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] stringArr = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    stringArr[0] = "Mario";
    stringArr[1] = "Luigi";
    stringArr[2] = "Wario";
    stringArr[3] = "Waluigi";
    // Get the value of the array at index 2
    System.out.println(stringArr[2]);
    // Get the length of the array
    System.out.println(stringArr.length);
    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < stringArr.length; i++)
    {
      System.out.println(stringArr[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for(String name : stringArr)
    {
      System.out.println(name);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
