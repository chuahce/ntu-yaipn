/* 
 * Sum the running integers from lowerbound to an upperbound.
 * Also compute the average.
*/
public class SumAverageRunningNumbers {

  public static void main(String[] args) {
    // Declare variables
    int sum = 0;    // Store the accumulated sum
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 1000;
    double average;

    // Use a for-loop to accumulate the sum
    for (int number = LOWERBOUND; number <= 1000; ++number) {
      // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ... ,UPPERBOUND for each iteration 
      sum += number;
    }
    average = (double) sum / (UPPERBOUND - LOWERBOUND + 1); // need to cast int to double first
    // Print results
    System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
    // The sum from 1 to 1000 is: 500500
    System.out.println("The average is: " + average);
    // The average is: 500.5

    // Sum only the ODD numbers
    int count = 0;    // counts of odd numbers
    sum = 0;          // reset sum for accumulation again
    // Adjust LOWERBOUND to the next odd number if it is a even number
    final int ADJUSTED_LOWERBOUND = LOWERBOUND % 2 == 0 ? LOWERBOUND + 1 : LOWERBOUND;
    // Use a for-loop to accumulate the sum with step size of 2
    for (int number = ADJUSTED_LOWERBOUND; number <= UPPERBOUND; number += 2) {
      // number = ADJUSTED_LOWERBOUND, ADJUSTED_LOWERBOUND+2, ADJUSTED_LOWERBOUND+4, ..., UPPERBOUND for each iteration
      ++count;
      sum += number;
    }
    average = (double) sum / count;
    System.out.println("The sum of odd numbers is: " + average);
    // The average of odd numbers is: 500.0
  }
}