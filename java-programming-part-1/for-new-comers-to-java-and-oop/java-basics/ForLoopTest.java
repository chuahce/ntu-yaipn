/* 
 * Test for-loop.
 */

/* 
// for-loop
for (init; booleanTest; update) {
  body;
}
// next statement
 */

public class ForLoopTest {
  public static void main(String[] args) {
    // Sum from 1 to upperbound
    int sum = 0;
    final int UPPERBOUND = 100;
    for (int number = 1; number <= 100; ++number) {
      // number = 1, 2, 3, ..., UPPERBOUND
      sum += number;
    }
    System.out.println("Sum is: " + sum);

    // Factorial of n (=1*2*3*...*n)
    int n = 5;
    int factorial = 1;
    for (int num = 1; num <= n; ++num) {
      factorial += num;
    }
    System.out.println("Factorial is: " + factorial);   
  } 
}

/* Try to visualize and draw out for-loop chart */
