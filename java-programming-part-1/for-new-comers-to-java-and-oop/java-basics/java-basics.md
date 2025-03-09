```Java

Java Program Template
/**
 * Comment to state the purpose of the program
 */

 public class Classname{ // Choose a meaningful Classname. Save as "Classname.java"
  public static void main(String[] Args){ // Entry point of the program
    // Your programming statements here!!!
  }
 }

Statements and Blocks
/* Statement */
// Each of the following lines is a programming statement, which ends with a semi-colon (;).
// A programming statement performs a piece of programming action.
int number1 = 10;
int number2, number3 = 99;
int product;
number2 = 8;
product = number1 * number2 * number3;
System.out.println("Hello");

/* Block */
// Each of the followings is a "compound" statement comprising one or more blocks of statements.
// No terminating semi-colon needed after the closing brace to end the "compound" statement.
// Take note that a "compound" statement is usually written over a few lines for readability.

if (mark >= 50) { // A if statement
  System.out.println("PASS);
  System.out.println("Well Done!");
  System.out.println("Keep it Up!");
}

if (input != -1) {  // A if-else statement
  System.out.println("Continue");
} else {
  System.out.print(i + " ");
  ++i;
}

public static void main(String[] args) {   // A method definition statement
   ...statements... 
}
 
public class Hello {   // A class definition statement
   ...statements... 
}

White Spaces and Formatting Source Code
/* White Spaces */
int sum = 0;     // Cannot write "intsum". Need at least one white space between "int" and "sum"
double average;  // Again, need at least a white space between "double" and "average"

// Same as above with many redundant white spaces. Hard to read.
int  sum 
=0     ;

   double  
average
;

// Also same as above with minimal white space. Also hard to read
int sum=0;double average;

/* Formatting Source Code */
public class Hello{public static void main(String[] args){System.out.println("Hello, world!");}}

/* Braces */
// Java's convention is to place the beginning brace at the end of the line, and to align the ending brace with the start of the statement. Pair-up the { } properly. Unbalanced { } is one of the most common syntax errors for beginners.

/* Indentation */
/**
 * Recommended Java programming style (Documentation comments about the class)
 */
public class ClassName {      // Place the beginning brace at the end of the current line
   public static void main(String[] args) {  // Indent the body by an extra 3 or 4 spaces for each level
   
      // Use empty line liberally to improve readability
      // Sequential statements
      statement-1;
      statement-2;
   
      // A if-else statement
      if (test) {
         true-statements;
      } else {
         false-statements;
      }
      
      // A loop statement
      init;
      while (test) {
         body-statements;
         update;
      }
   }
}   // Ending brace aligned with the start of the statement

Variables and Types
/* Variables - Name, Type and Value */
int sum;         // Declare an "int" variable named "sum"
double average;  // Declare a "double" variable named "average"
String message;  // Declare a "String" variable named "message"
char grade;      // Declare a "char" variable named "grade"
A variable can store a value of the declared data type. It is important to take note that a variable in

/* Identifiers (or Names) */

/* Variable Naming Convention */

/* Variable Declaration */
// Declare a variable of a specified type
type identifier;
int sum;
double average;
String statusMsg;

// Declare multiple variables of the SAME type,
// separated by commas
type identifier1, identifier2, ..., identifierN;
int number, count;
double sum, difference, product, quotient;
String helloMsg, gameOverMsg;

// Declare a variable and assign an initial value
type identifier = initialValue;
int magicNumber = 99;
double pi = 3.14169265;
String helloMsg = "hello,";

// Declare multiple variables of the SAME type,
// with initial values
type identifier1 = initValue1, ..., identifierN = initValueN;	int sum = 0, product = 1;
double height = 1.2, length = 3.45;
String greetingMsg = "hi!", quitMsg = "bye!";

Constants (final variables)
final double PI = 3.14159265;  // Declare and initialize the constant
final int SCREEN_X_MAX = 1280;
SCREEN_X_MAX = 800;  //compilation error: cannot assign a value to final variable

// You can only assign value to final variables ONCE
final int SCREEN_Y_MIN;
SCREEN_Y_MIN = 0;   // First assignment
SCREEN_Y_MIN = 10;  //compilation error: variable might already have been assigned

// Constant Naming Convention: Use uppercase words, joined with underscore. For example, MIN_VALUE, MAX_SIZE, and INTEREST_RATE_6_MTH.

/* Expressions */
// "int" literals
((1 + 2) * 3 / 4) % 6   // This expression is evaluated to an "int" value

// "double" literals
3.45 + 6.7              // This expression is evaluated to a "double" value

// Assume that variables sum and number are "int"
sum + number * number   // evaluates to an "int" value

// Assume that variables principal and interestRate are "double"
principal * (1.0 + interestRate)  // evaluates to a "double" value

/* Assignment (=) */
// Assign the RHS literal value to the LHS variable
variable = literalValue;	int number;
number = 9;
// Evaluate the RHS expression and assign the result to the LHS variable
variable = expression;	int sum = 0, number = 8;
sum = sum + number;

int number;
number = 8;           // Assign RHS literal value of 8 to the LHS variable number
number = number + 1;  // Evaluate the RHS expression (number + 1),
                      //  and assign the resultant value back to the LHS variable number

8 = number;           // Invalid in Programming, LHS shall be a variable
number + 1 = sum;     // Invalid in Programming, LHS shall be a variable

Primitive Types and String
/* Built-in Primitive Types */

/* Integers vs. Floating-Point Numbers */

/* Data Representation */

/* Maximum/Minimum Values of Primitive Number Types */

/* One More Important Type - String */
String greetingMsg = "hello, world";  // String is enclosed in double-quotes
char gender = 'm';       // char is enclosed in single-quotes
String statusMsg = "";   // an empty String

/* Choice of Data Types for Variables */
Example (Variable Names and Types): Paul has bought a new notebook of "idol" brand, with a processor speed of 2.66GHz, 8 GB of RAM, 500GB hard disk, with a 15-inch monitor, for $1760.55. He has chosen service plan 'C' among plans 'A', 'B', 'C', and 'D', plus on-site servicing but did not choose extended warranty. Identify the data types and name the variables.

String name = "Paul";
String brand = "idol"
double processorSpeedInGHz = 2.66; // or float
double ramSizeInGB = 8;            // or float
int harddiskSizeInGB = 500;        // or short
int monitorSizeInInch = 15;        // or byte
float price = 1760.55;
char servicePlan = 'C';
boolean onSiteService = true;
boolean extendedWarranty = false;

Exercise (Variable Names and Types): You are asked to develop a software for a college. The system shall maintain information about students. This includes name, address, phone number, gender, date of birth, height, weight, degree pursued (e.g., B.Sc., B.A.), year of study, average GPA, with/without tuition grant, is/is not a scholar. Each student is assigned a unique 8-digit number as id.
You are required to identify the variables, assign a suitable name to each variable and choose an appropriate type. Write the variable declaration statements as in the above example.

String name;
String address;
String phoneNumber;
String gender;
String dateOfBirth;
float height;
float weight;
String degreePursued;
int yearOfStudy;           // Assuming year is a numeric value (1, 2, 3, etc.)
float averageGPA;
boolean hasTuitionGrant;
boolean isScholar;
String studentId;         // Use String if the 8-digit id may include leading zeros; otherwise, consider int or long

Literals for Primitive Types and String
/* Integer (int, long, short, byte) literals */
int number = -123;
int sum = 1234567890;     // This value is within the range of int
int bigSum = 8234567890;  // error: this value is outside the range of int
int intRate = 6%;         // error: no percent sign
int pay = $1234;          // error: no dollar sign

int number1 = 1234;   // The usual decimal
int number2 = 01234;  // Octal 1234, Decimal 2322
int number3 = 0017;   // Octal 17, Decimal 15
int number4 = 0x1abc; // Hexadecimal 1ABC, decimal 15274

// JDK 7
int number1 = 0b01010000101000101101000010100010;
int number2 = 0b0101_0000_1010_0010_1101_0000_1010_0010;  // break the bits with underscore
int number3 = 2_123_456;  // break the decimal digits with underscore
int number4 = _123_456;   // error: cannot begin or end with underscore

long sum = 123;                // Within the "int" range, no need for suffix 'L'
long bigSum = 1234567890123L;  // Outside "int" range, suffix 'L' needed

byte smallNumber1 = 123;        // This is within the range of byte [-128, 127]
byte smallNumber2 = -1234;      // error: this value is out of range

short midSizeNumber1 = -12345;  // This is within the range of short [-32768, 32767]
short midSizeNumber2 = 123456;  // error: this value is out of range

/* Floating-point (double, float) literals */
float average = 55.66;    // error: RHS is a double. Need suffix 'f' for float.
float average = 55.66F;   // float literal needs suffix 'f' or 'F'

float rate = 1.2e-3;    // error: RHS is a double. Need suffix 'f' for float.
float rate = 1.2e-3f;   // float literal needs suffix 'f' or 'F'

/* Character (char) Literals and Escape Sequences */
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

/* String Literals and Escape Sequences */
String directionMsg = "Turn Right";
String greetingMsg = "Hello";
String statusMsg = "";        // An empty string

String str1 = "hello\tworld\n";    // tab and newline
String str2 = "a double quoted \"hello\"";
String str3 = "1 back-slash \\, another 2 back-slashes \\\\";
String str1 = "A \"string\" nested \\inside\\ a string"   // A "string" nested \inside\ a string
String str2 = "Hello, \u60a8\u597d!"   // "Hello, 您好!"

String str3 = "Hi, I'm a string!"      // Single quote OK

/* var - Local Variable Type Inference (JDK 10) */
var v1 = 0;        // type inferred to "int"
var v2 = 0.0;      // type inferred to "double"
var v3 = 1.0f;     // type inferred to "float"
var v4 = '0';      // type inferred to "char"
var v5 = "hello";  // type inferred to "String"
//var v6;          //compilation error: cannot use 'var' on variable without initializer


/* Basic Operations */
int number = -9;
number = -number; // Unary negate

byte b1 = 5, b2 = 9, b3;
// byte + byte -> int + int -> int
b3 = b1 + b2;           // error: RHS is "int", cannot assign to LHS of "byte"
b3 = (byte)(b1 + b2);   // Need explicit type casting (to be discussed later)

byte b1 = 5, b2 = 9;
b2 += b1;     // Result in "int", but automatically converted back to "byte"

/* Conditional Flow Control */
/* if-then and if-then-else */

// if-then
int absValue = -5;
if (absValue < 0) absValue = -absValue;   // Only one statement in the block, can omit { }
 
int min = 0, value = -5;
if (value < min) {     // More than one statements in the block, need { }
   min = value;
   System.out.println("Found new min");
}
 
// if-then-else
int mark = 50;
if (mark >= 50) 
   System.out.println("PASS");   // Only one statement in the block, can omit { }
else {                           // More than one statements in the block, need { }
   System.out.println("FAIL");
   System.out.println("Try Harder!");
}

// Harder to read without the braces
int number1 = 8, number2 = 9, absDiff;
if (number1 > number2) absDiff = number1 - number2;
else absDiff = number2 - number1;

/* Dangling-else Problem */

/* Using boolean Flag for Loop Control */
// Game loop
boolean gameOver = false;
while (!gameOver) {
   // play the game
   ......
   // Update the game state 
   // Set gameOver to true if appropriate to exit the game loop
   if ( ...... ) {
      gameOver = true;    // exit the loop upon the next iteration test
   }
}

/*
Example: Suppose that your program prompts user for a number between 1 to 10, and checks for valid input. A do-while loop with a boolean flag could be more appropriate as it prompts for input at least once, and repeat again and again if the input is invalid.
*/

// Input with validity check
boolean isValid = false;
int number;
do {
  // prompt user to enter an int between 1 and 10
  ......
  // if the number entered is valid, set done to exit the loop
  if (number >= 1 && number <= 10) {
     isValid = true;    // exit the loop upon the next iteration test
     // Do the operations
     ......
  } else {
     // Print error message and repeat (isValid remains false)
     ......
  }
} while (!isValid);     // Repeat for invalid input

/* for-loop with Comma Separator */
// for (init; test; update) { ...... }
for (int row = 0, col = 0; row < SIZE; ++row, ++col) {
   // Process diagonal elements (0,0), (1,1), (2,2),... 
   ......
}

/* Terminating Program */
/*
System.exit(int exitCode): You could invoke the method System.exit(int exitCode) to terminate the program and return the control to the Java Runtime. By convention, return code of zero indicates normal termination; while a non-zero exitCode indicates abnormal termination. For example,
*/

if (errorCount > 10) {
   System.out.println("too many errors");
   System.exit(1);  // Terminate the program with abnormal exit code of 1
}

/*The return statement: You could also use a "return" statement in the main() method to terminate the main() and return control back to the Java Runtime. For example,
*/

public static void main(String[] args) {
   ...
   if (errorCount > 10) {
      System.out.println("too many errors");
      return;  // Terminate and return control to Java Runtime from main()
   }
   ...
}

