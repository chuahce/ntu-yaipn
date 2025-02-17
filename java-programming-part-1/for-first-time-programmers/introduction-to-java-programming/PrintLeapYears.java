/*
 * Print all the leap years between AD999 and AD2010 and the total number of leap years
 */

public class PrintLeapYears {

  public static void main(String[] Args){
  final int LOWERBOUND = 999;
  final int UPPERBOUND = 2010;

  int count = 0;

  int year = LOWERBOUND;
  while (year <= UPPERBOUND){
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
      System.out.println(year);
      ++count;
    }
    ++year;
  }
  System.out.println("The total number of leap years is " + count);
  }
}
