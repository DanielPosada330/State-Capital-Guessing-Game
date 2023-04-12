/*File is saved as a text file for grading purposes.
I used replit to code the program.
This file contains the first part of the assignment.*/

//Importing java.util.* to utilize the scanner and arrays packages.
import java.util.*;

//Main class containing the program.
public class PartOneSortingArrays {
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
    System.out.println("Welcome to the Capital City Guessing Game!");
    System.out.println(
        "\nIn this game, each of the states will be shown,\nand you will try to correctly input each of their respective capitals.");

    // initalize Scanner.
    Scanner scanner = new Scanner(System.in);

    // Creating variable counting correct answers.
    int correctAnswer = 0;

    // Defining sub array of states for the user to guess the corresponding capital.
    String[] states = statesCapitals[0];
    // Defining sub array of the capitals to check against user answer.
    String[] capitals = statesCapitals[1];
    // Creating for-each loop to iterate through state array.
    for (String state : states) {
      System.out.println("\nWhat is the capital of: " + state + "?\n");
      // Store the answer the user inputs in a variable.
      String userInput = scanner.nextLine();
      // Creating for-each loop to iterate through capital array.
      for (String capital : capitals) {
        // Check user answer against element stored in array.
        if (capital.equalsIgnoreCase(userInput)) {
          System.out.println("\nCorrect!\n");
          correctAnswer++;
          System.out.println("Corrects answers thus far: " + correctAnswer + ".");
          break;
        } 
        else {
          System.out.println("\nSorry, that is not the correct capital.");
          break;
        }
      }
    }
    //Final statement to user.
    System.out.println("You correctly guessed: " + correctAnswer + " capitals!");
    System.out.println("\nThank you for playing the game! Have a good day!");

    //Switching from game to administrative functions.
    System.out.println("I am now going to print out the contents of the 2d array.");
    //Print the contents of the array.
    for (int i = 0; i < 50; i++){
      System.out.println("The capital of " + statesCapitals[0][i] + " is " + statesCapitals[1][i] + ".");
    }
    
  }
}