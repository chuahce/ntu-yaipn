/* 
 * Test char literals for integers and escape sequences
 */

public class CharLiteralTest {
  public static void main(String[] args) { 

    char letter = 'a';                 // Same as 97
    char anotherLetter = 98;           // Same as the letter 'b'
                                   // You can assign an integer in the range of [0, 65535] to char
    System.out.println(letter);        // 'a' printed
    System.out.println(anotherLetter); // 'b' printed instead of the number, because the type is char
    anotherLetter += 2;                // 100 or 'd'
    System.out.println(anotherLetter); // 'd' printed

    char tabChar = '\t';          // tab
    char anotherTabChar = 9;      // Code number 9 is tab
    char newlineChar = '\n';      // newline, code number 10
    char backSlashChar = '\\';    // Since back-slash is given a special meaning,
                              // to write a back-slash, use double back-slash
    char singleQuoteChar = '\'';  // Need to use escape sequence to resolve conflict
    char doubleQuoteChar = '"';   // No conflict. No need for escape sequence
    System.out.println("A tab " + tabChar + " before this; end with two newlines!" + newlineChar + newlineChar);
  }  
}

