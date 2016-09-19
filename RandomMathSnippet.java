/* Random/Math Snippet
 * your name here
 */

/****** 1. import the Random class */
import java.util.Random;
import java.util.Scanner;

public class RandomMathSnippet
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner( System.in );
    
    /***** 2. Instantiate a Random object */
    Random rand = new Random();
    
    
    /***** 3. Generate a random number between 1 and 10
     *     ask the user to guess the number
     *     if the user guesses the number, congratualate them. 
     *     Otherwise, output the number and tell the user how far away the guess was
     *     from the number.
    */   
    int secretNumber = rand.nextInt( 10 ) + 1;
    System.out.println( "Shh. The secret number is " + secretNumber );
    
    System.out.println(" Im thinkinig of a number between 1 and 10.");
    System.out.println(" Try to guess it!");
    int guess = scan.nextInt();
    
    if ( guess == secretNumber )
    {
      System.out.println( " YOu guessed it wdwa" );
    }
    else
    {
    System.out.println( "Sorry. Your guess is off by "
                        + Math.abs (secretNumber - guess) +" numbers");
                        
    }
        
    /***** 4. Generate 3 random numbers between 10 and 100
      *    Output the three numbers
      *    Output the largest of the three numbers
    */
    int num1 = rand.nextInt(91) + 10; 
    // 91 = 100 - 10 + 1
    
    int num2 = rand.nextInt(91)+ 10;
    // 89 = 100 - 11 +  
     int num3 = rand.nextInt(91)+ 10;
    // 89 = 100 - 11 + 
    
    System.out.println(" The Numbers are " + num1 + ", "
                       + num2 + ", and" + num3 + ".");
    int larger = Math.max( num2, num2);
    int largest = Math.max( larger, num3 );
    
    System.out.println( " The largest number is " + largest + ".");
    /***** 5. Prompt the user for a number and a power. 
      * Then raise the number to that power. For example, 
      * if the user enters 5 and 4, you would raise 5 to the 4th power.
    */
    System.out.println (" Enter a base and a power");
    int base = scan.nextInt();
    int power = scan.nextInt();
    double result = Math.pow( base, power);
    System.out.println(base + "raised to the power" + power + "is" + (int) result);
  }
}