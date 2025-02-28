```Java
/*
 * What is Variable? Declaring and Using Variables.
 */

type varName;                 // Declare a variable of a type
type varName1, varName2,...;  // Declare multiple variables of the SAME type
type varName = initialValue;  // Declare a variable of a type, and assign an initial value
type varName1 = initialValue1, varName2 = initialValue2,... ;  // Declare variables with initial values

int sum; // Declare a variable named "sum" of the type "int" for storing an integer.
// Terminate the statement with a semi-colon.
double average; // Declare a variable named "average" of the type "double" for storing a real number.
int number1, number2; // Declare 2 "int" variables named "number1" and "number2", separated by a comma.
int height = 20; // Declare an "int" variable, and assign an initial value.
String msg = "Hello"; // Declare a "String" variable, and assign an initial value.

int number; // Declare a variable named "number" of the type "int" (integer).
number = 99; // Assign an integer value of 99 to the variable "number".
number = 88; // Re-assign a value of 88 to "number".
number = number + 1; // Evaluate "number + 1", and assign the result back to "number".
int sum = 0; // Declare an int variable named "sum" and assign an initial value of 0.
sum = sum + number; // Evaluate "sum + number", and assign the result back to "sum", i.e. add number into sum.
int num1 = 5, num2 = 6; // Declare and initialize 2 int variables in one statement, separated by a comma.
double radius = 1.5; // Declare a variable named "radius", and initialize to 1.5.
String msg; // Declare a variable named msg of the type "String".
msg = "Hello"; // Assign a double-quoted text string to the String variable.
int number; // ERROR: The variable named "number" has already been declared.
sum = 55.66; // ERROR: The variable "sum" is an int. It cannot be assigned a double.
sum = "Hello"; // ERROR: The variable "sum" is an int. It cannot be assigned a string.
 