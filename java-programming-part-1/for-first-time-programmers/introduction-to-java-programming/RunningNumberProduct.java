/*
 * Product of all the numbers from 1 to 10
 */

public class RunningNumberProduct {

  public static void main(String[] Args){
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 10;

    int product = 1;

    int number = 1;
    while (number <= UPPERBOUND){
      product = product * number;
      ++number;
    }
    
    System.out.println("The product of all the numbers from 1 to 10 is " + product);
  }
}
