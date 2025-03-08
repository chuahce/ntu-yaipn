/* 
 * Test while-do loop.
 */

/*  
// while-do loop
while (booleanTest) {
  body;
}
// next statement
*/

public class WhileDoLoopTest {

  public static void main(String[] args) {    // Program entry point
    // Sum from 1 to upperbound
    int sum = 0;
    final int UPPERBOUND = 100;
    int number = 1; // init
    while (number <= UPPERBOUND) {
      // number = 1, 2, 3, ... , UPPERBOUND
      // for each iteration
      sum += number;
      ++number;   // update
    }
    System.out.println("sum is " + sum);

    // Factorial of n (=1*2*3*...*n)
    int n = 5;
    int factorial = 1;
    int num = 1;   // init
    while (num <= n) {
      // num = 1, 2, 3, ..., n for each iteration 
      factorial *= num;
      ++num;    // update
    }
    System.out.println("factorial is: " + factorial);
  }
}

/* Try to visualize and draw out the while-do loop chart */
