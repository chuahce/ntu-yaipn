/* *
 * Test if-then conditional flow control
 */

/* 
// if-then
if (booleanTest) {
   trueBlock;
}
// next statement
 */

public class IfThenTest {
  public static void main(String[] args) { // Program entry point
    // Declare integer variable and assign value
    int mark = 50;   
    // if-then 
    if (mark >= 50) {
      System.out.println("Well Done!");
      System.out.println("Keep it up!");
    }
    System.out.println("Life goes on!");

    double temperature = 80.1;
    if (temperature >= 80) {
      System.out.println("Too Hot!");
    }
    System.out.println("yummy!");
  }
}

/*
* Try to visualize and draw the flow chart of if-then 
*/