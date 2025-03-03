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








