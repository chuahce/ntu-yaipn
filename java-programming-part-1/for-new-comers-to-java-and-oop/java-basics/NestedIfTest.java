/* 
 * Test nested-if conditional flow control
 */

/* 
// nested-if
if (booleanTest1) {
   block1;
} else if (booleanTest2) {
   block2;
} else if (booleanTest3) {
   block3;
} else if (booleanTest4) {
   ......
} else {
   elseBlock;
}
// next statement
*/

public class NestedIfTest {
  public static void main(String[] args) {
    int mark = 62;  // Assume that mark is [0, 100]
    if (mark >=80) {              // [80, 100]
      System.out.println("A");
    }
    else if (mark >= 65) {        // [65, 79]
      System.out.println("B");
    }
    else if (mark >= 50) {        // [50, 64]
      System.out.println("C");
    } else {                      // [0, 49]
      System.out.println("F");
    }
    System.out.println("Life goes on!");

    double temperature = 61;
    if (temperature > 80) {                 // > 80
      System.out.println("Too Hot!");
    }
    else if (temperature > 75) {            // (75, 80]
      System.out.println("Just right!");
    } else {                                // <= 75
      System.out.println("Too Cold!");
    }
    System.out.println("yummy!");
  }
}

/*
Java does not provide a separate syntax for nested-if (e.g., with keywords like eif, elseif), but supports nested-if with nested if-else statements, which is interpreted as below. Take note that you need to put a space between else and if. Writing elseif causes a syntax error.

if ( booleanTest1 ) {
   block1;
} else {   // This else-block contains a if-else statement
   if ( booleanTest2 ) {
      block2;
   } else {  // This else-block also contains a if-else statement
      if (booleanTest3) {
         block3;
      } else {  // This else-block also contains a if-else statement
         if ( booleanTest4 ) {
            ......
         } else {
            elseBlock;
         }
      }
   }
}
// This alignment is hard to read!
*/

/* 
 * However, for readability, it is recommended to align the nest-if statement as written in the syntax/examples.

Take note that the blocks are exclusive in a nested-if statement; only one of the blocks will be executed. Also, there are two ways of writing nested-if, for example,

// Assume that mark is [0, 100]
if (mark >= 80) {           // [80, 100]
   System.out.println("A");
} else if (mark >= 65) {    // [65, 79]
   System.out.println("B");
} else if (mark >= 50) {    // [50, 64]
   System.out.println("C");
} else {                    // [0, 49]
   System.out.println("F");
}
// OR
if (mark < 50) {            // [0, 49]
   System.out.println("F");
} else if (mark < 65) {     // [50, 64]
   System.out.println("C");
} else if (mark < 80) {     // [65, 79]
   System.out.println("B");
} else {                    // [80, 100]
   System.out.println("A");
}
 */

/*
* Try to visualize and draw the flow chart of nested-if 
*/

