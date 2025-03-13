import java.io.Console;
import java.util.Arrays;
/* 
 * Inputting password via COnsole
 */
public class ConsolePasswordTest {
  static String login;
  static char[] password;

  public static void main(String[] args) {
    Console con = System.console();
    if (con == null) {
      System.err.println("Console Object is not available.");
      System.exit(1);
    }

    login = con.readLine("Enter your login Name: ");
    password = con.readPassword("Enter your password: ");
    if (checkPassword(login, password)) {
      Arrays.fill(password, ' ');    // Remove password from memory
      // Continue ...

    }
  }

  static boolean checkPassword(String login, char[] password) {
    return true;
  }
}
