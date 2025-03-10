/* *
 * Test Scanner's nextLine()
 */

import java.util.Scanner;   // Needed to use the Scanner

public class ScannerNextLineTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string (wuth space): ");
    // Use nextLine() to read entire line including white spaces
    // but excluding the terminating newline.
    String str = in.nextLine();
    in.close();
    System.out.printf("%s%n", str);   
  }
}

/* Try not to mix nextLine() and nextInt()|nextDouble()|next() in a program (as you may need to flush the newline from the input buffer). */
