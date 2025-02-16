/*
 * Sum all the numbers from 9 to 899
 */

public class RunningNumberSum1 {

  public static void main(String[] Args){ // Entry point
    final int LOWERBOUND = 9; // Store the lowerbound
    final int UPPERBOUND = 899; // Store the upperbound

    int sum = 0; // Declare an int variable "sum" to accumulate the numbers
                 // Set the initial sum to 0
    // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
    int number = LOWERBOUND;
    while (number<=899){
      sum = sum + number; // Accumulate number into sum
      ++number;           // increment number
    }
    // Print the result
    System.out.println("The sum of all the numbers from 9 to 899 is " + sum);
  } 
}
