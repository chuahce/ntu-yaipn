/*
 * Sum of the square of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 +...
 */

public class RunningNumberSquareSum {

  public static void main(String[] Args){
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 100;

    int sum = 0;

    int number = LOWERBOUND;
    while (number<=100){
      sum = sum + (number * number);
      ++number;
    }

    System.out.println("The sum of the square of all the numbers from 1 to 100 is " + sum );
  }
}
