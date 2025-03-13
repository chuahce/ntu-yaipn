/* *
 * Output to File.
 * Technique 2: Use try-catch to handle exception
 */
import java.util.Formatter;
import java.io.File;                    // <= note
import java.io.FileNotFoundException;   // <= note

public class TextFileFormatterWithCatch {
  public static void main(String[] args) {
    try {   // try the following statements
      // Construct a Formatter to write formatted output to a text file
      Formatter out = new Formatter(new File("out.txt"));
      // Write to file with format() method (similar to printf())
      int num1 = 1234;
      double num2 = 55.66;
      String name = "Pauline";
      out.format("Hi %s, %n", name);
      out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1+num2);
      out.close();
      System.out.println("Done");
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
  }
}
