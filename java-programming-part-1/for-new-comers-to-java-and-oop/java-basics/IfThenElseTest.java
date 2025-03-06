/* 
 * Test if-then-else conditional flow control
 */

/* 
// if-then-else
if (booleanTest) {
   trueBlock;
} else {
   falseBlock;
}
// next statement
*/

public class IfThenElseTest {
  public static void main(String[] args) { // Program entry point
  // Declare 2 integer variable and assign value2
  int mark = 50;      // Assume that mark is [0, 100]
  double temperature = 80.1;
  // if-then-else
  if (mark >= 50) {   // [50, 100]
    System.out.println("Well Done!");
    System.out.println("Keep it up!");
  } else {            // [0, 49]
    System.out.println("Try Harder!");
  }
  System.out.print("Life goes on!");

  if (temperature >= 80) {
    System.out.println("Too Hot!");
  } else {
    System.out.println("Too Cold!");
  }
  System.out.print("yummy!");
  }
}

/*
* Try to visualize and draw the flow chart of if-then-else 
*/