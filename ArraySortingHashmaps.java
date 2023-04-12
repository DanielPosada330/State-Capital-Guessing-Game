/*File is saved as a text file for grading purposes.
I used replit to code the program.
*/

//Importing java.util.* to utilize the scanner and arrays packages.
import java.util.*;

//Main class containing the program.
public class ArraySortingHashmaps {
  public static void main(String[] args) {
    // Creating 2d array containing states and their capitals ordered by state.
    String[][] statesCapitals = {

        { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida",
            "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
            "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska",
            "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio",
            "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee",
            "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" },
        { "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee",
            "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort",
            "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City",
            "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck",
            "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville",
            "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne" }
    };

    // Welcoming statement to the user.
    System.out.println("\nWelcome to the Capital City Guessing Program!");
    System.out.println(
        "\nIn this game, each of the states will be shown,\nand you will try to correctly input each of their respective capitals.");

    // initalize Scanner.

    Scanner scanner = new Scanner(System.in);

    // Creating variable counting correct answers.
    int correctAnswer = 0;

    // Creating for-each loop to iterate through state array.
    for (int i = 0; i < 50; i++) {
      System.out.println("\nWhat is the capital of: " + statesCapitals[0][i] + "?\n");
      // Store the answer the user inputs in a variable.
      String userInput = scanner.nextLine();
      // Creating for-each loop to iterate through capital array.
      for (int j = 0; j < 50; j++) {
        // Check user answer against element stored in array.
        if (statesCapitals[1][i].equalsIgnoreCase(userInput)) {
          System.out.println("\nCorrect!");
          correctAnswer++;
          System.out.println("\nCorrect answers thus far: " + correctAnswer + ".");
          break;
        } else {
          System.out.println("\nSorry, that is not the correct capital.");
          System.out.println("\nCorrect answers thus far: " + correctAnswer + ".");
          break;
        }
      }
    }
    // Final statement to user.
    System.out.println("You correctly guessed: " + correctAnswer + " capitals!");
    System.out.println(
        "\nNow we will be moving onto bubble sorting this array.");

    // Printing out array and starting bubble sort.
    System.out.println("I am now going to print out the contents of the 2d array.\n");
    // Print the contents of the array.
    for (int i = 0; i < 50; i++) {
      System.out.println("The capital of " + statesCapitals[0][i] + " is " + statesCapitals[1][i] + ".\n");
    }
    /*
     * Next comes the bubble sort of the program.
     * This will organize the array by capitals alphabetically.
     * These two for loops will iterate through the elements to compare
     * alphabetically to each other
     */
    for (int i = 0; i < statesCapitals[0].length; i++) {
      for (int j = i + 1; j < statesCapitals[0].length; j++) {
        // These two variables help temporarily store the moved variables.
        String tempCapital;
        String tempState;
        /*
         * If the next capital (j) is less than the current capital (i),
         * then the following if statement will swap the two values and place
         * the current capital into the temporary varaible, make the next capital the
         * current
         * capital, then assign the temporary value to the next capital
         */
        if (statesCapitals[1][j].compareTo(statesCapitals[1][i]) < 0) {
          tempCapital = statesCapitals[1][i];
          statesCapitals[1][i] = statesCapitals[1][j];
          statesCapitals[1][j] = tempCapital;

          /*
           * We are going to do the same thing to the states, to make sure that the
           * capitals are correctly aligned to their respective states.
           */
          tempState = statesCapitals[0][i];
          statesCapitals[0][i] = statesCapitals[0][j];
          statesCapitals[0][j] = tempState;
        }
      }
    }

    System.out.println("The following array has been successfully bubble sorted.\n");
    System.out.println(
        "It has been formatted by capital city alphabetically, and thus will show city,\nTHEN state when printed below.\n");
    for (int i = 0; i < 50; i++) {
      System.out.println("The capital city of " + statesCapitals[1][i] + " is in " + statesCapitals[0][i] + ".\n");
    }
    // Starting the second half of the assignment. Hashmaps contain key value pairs
    // of states being keys, and capitals as values.
    HashMap<String, String> capitalCitiesMap = new HashMap<>(statesCapitals[0].length);
    // This next function iterates through the previous array and inputs the states
    // and capitals into their key: value pairs in the hashmap.
    for (int i = 0; i < statesCapitals[0].length; i++) {
      capitalCitiesMap.put(statesCapitals[0][i], statesCapitals[1][i]);
    }
    // Next we will print out the contents of the hashmap.
    System.out.println("\nNext we will be working with the hashmap portion of the assignment.");
    System.out.println("\nPlease note that this will be unordered at first.");
    // For-each loop to iterate each key: value pair.
    for (String key : capitalCitiesMap.keySet()) {
      System.out.println("\nThe capital of " + key + " is " + capitalCitiesMap.get(key) + ".");
    }
    /*
     * Next up is to use the TreeMap class to sort the map.
     * By using a TreeMap class, we are inherently using a binary search tree for
     * storage.
     */
    TreeMap<String, String> capitalCitiesSorted = new TreeMap<>(capitalCitiesMap);
    for (String key : capitalCitiesSorted.keySet()) {
      // This is showing that the TreeMap used sorted out the original HashMap by
      // states.
      System.out.println("\nThe capital of " + key + " is " + capitalCitiesSorted.get(key) + ".");
    }
    // Prompting the user for their state choice.
    System.out
        .println("\nFor this next portion, you will enter a state, \nand the corresponding capital city will appear.");
    System.out.println("\nShould you wish to quit, simply type out \'quit\'.");
    /*
     * We must create a while loop, to make sure that the user can keep
     * looking up cities until they enter 'quit'.
     * To do this we will create a loop variable to keep the loop going.
     */
    Boolean loopContinue = false;
    /*
     * 
     * As the prompt did not ask for the user's answer to be non-case sensitive,
     * it will be left as is and explained to the user.
     */
    System.out.println(
        "\nWhen entering the name of the state, start off with capital case.\ne.g. \'Texas\' or \'Michigan\'.");
    while (!loopContinue) {

      System.out.println("\nPlease enter the name of the state: ");
      // New input variable for this portion.
      String newUserInput = scanner.nextLine();

      // Check to see if user input is inside TreeMap.

      if (capitalCitiesSorted.containsKey(newUserInput)) {
        System.out.println("\nThe capital of " + newUserInput + " is " + capitalCitiesSorted.get(newUserInput) + ".");
      }
      if (newUserInput.equalsIgnoreCase("quit")) {
        System.out.println("\nThank you for using the program! Have a good day!");
        loopContinue = true;
        continue;
      }
    }
  }
}
