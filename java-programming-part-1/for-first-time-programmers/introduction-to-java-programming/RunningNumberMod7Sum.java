/*
 * Sum all the numbers between 1 to 1000 that are divisible by 7
 */

public class RunningNumberMod7Sum {

  public static void main(String[] Args){
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 1000;

    int sum = 0;

    int number = 7;
    while (number <= UPPERBOUND){
      sum = sum + number;
      number = number + 7;
    }

    System.out.println("The sum of all the numbers between 1 to 1000 that are divisible by 7 is " + sum);
  }
}
