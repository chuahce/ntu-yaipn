/*
 * Sum all the odd numbers between 1 to 1000
 */

public class RunningNumberOddSum {

  public static void main(String[] Args){
    // Declare and assign
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 1000;

    int sum = 0;

    int number = LOWERBOUND;
    while (number<=1000){
      sum = sum + number;
      number = number + 2;
    }

    System.out.println("The sum of all the odd numbers between 1 to 1000 " + sum);
  }
}
