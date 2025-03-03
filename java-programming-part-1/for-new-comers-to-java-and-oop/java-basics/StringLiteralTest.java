/* 
 * Test String literals for escape sequences
 */

public class StringLiteralTest {
  public static void main(String[] args) {
    String directionMsg = "Turn Right";
    String greetingMsg = "Hello";
    String statusMsg = "";                                          // An empty string

    String str1 = "hello\tworld\n";                                 // tab and newline
    String str2 = "a double quoted \"hello\"";
    String str3 = "1 back-slash \\, another 2 back-slashes \\\\";
    String str4 = "A \"string\" nested \\inside\\ a string";        // A "string" nested \inside\ a string
    String str5 = "Hello, \u60a8\u597d!";                           // "Hello, 您好!"

    String str6 = "Hi, I'm a string!";                              // Single quote OK

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str5);
    System.out.println(str6);
  }
}
