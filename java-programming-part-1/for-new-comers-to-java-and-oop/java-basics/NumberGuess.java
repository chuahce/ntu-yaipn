import java.util.Scanner;
/* 
 * Guess a secret number between 0 and 99.
 */
public class NumberGuess {
  public static void main(String[] args) {  // Program entry point
    // Define variables
    final int SECRET_NUMBER; // Secret number to be guessed
    int numberIn;            // The guess number entered
    int trialNumber = 0;     // Number of trials so far
    boolean done = false;    // boolean flag for loop control
    Scanner in = new Scanner(System.in);

    // Set up the secret number: Math.random() generates a double in [0.0, 1.0)
    SECRET_NUMBER = (int) (Math.random() * 100);

    // Use a while-loop to repeatedly guess the number until it is correct
    while (!done) {
      ++trialNumber;
      System.out.print("Enter your guess (between 0 and 99): ");
      numberIn = in.nextInt();
      if (numberIn == SECRET_NUMBER) {
        System.out.println("Congratulations!");
        done = true;
      } else if (numberIn >= SECRET_NUMBER) {
        System.out.println("Try Lower");
      } else {
        System.out.println("Try Higher");
      }

      /* 
      else if (numberIn < SECRET_NUMBER) {
        System.out.println("Try higher");
        } else {
          System.out.println("Try lower");
        }
       */
    }
    System.out.println("You got in " + trialNumber + " trials");
    in.close();
  }
}

/* 
Notes:
The above program uses a boolean flag to control the loop, in the following coding pattern:
boolean done = false;

while (!done) {
   if (......) {
       done = true;   // exit the loop upon the next iteration
       .....
   }
   ......   // done remains false. repeat loop
}
 */