/* 
 * Test do-while loop.
 */

/*  
// do-while loop
do {
   body;
} while (booleanTest);
// next statement
   // Need a semi-colon to
   // terminate statement
*/

public class DoWhileLoopTest {
  public static void main(String[] args) {
    // Sum from 1 to upperbound
    int sum = 0;
    final int UPPERBOUND = 100;
    int number = 1;   // init
    do {
      // number = 1, 2, 3, ..., UPPERBOUND
      // for each iteration
      sum += number;
      ++number;   // update
    } while (number <= 100);
    System.out.println("Sum is: " + sum);

    // Factorial of n (=1*2*3*...*n)
    int n = 5;
    int factorial = 1;
    int num = 1;   // init
    do {
      // num = 1, 2, 3, ..., n for each iteration
      factorial *= num;
      ++num;
    } while (num <= n);
    System.out.println("Factorial is: " + factorial);
  }
}

/* Try to visualize and draw out the do-while loop chart */