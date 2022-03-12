/* Primary U.S. interstate highways are numbered 1-95. 
 * Odd numbers (like the 11 or 95) go north & south. Even numbers (like the 6 or 90) go east & west. 
 * Auxiliary highways are numbered 100-999 and they service the primary highway indicated by the 
 * rightmost two digits. Thus, I-411 services I-11, and I-290 services I-90. 
 * Note: 300 is not a valid auxiliary highway because 00 is not a valid primary highway number.
 *
 * Given a highway number, indicate whether it is a primary or auxiliary highway. 
 * If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway 
 * runs north/south or east/west.
*/

// Example: If input is 80
// Output is: I-80 is primary, going east/west.
// If input is 280
// Output is: I-280 is auxiliary, serving I-80, going east/west.
// Corner Case #1: If input is 0
// Output is: 0 is not a valid interstate highway number. 
// Corner Case #2: If input is 300
// Output is: 300 is not a valid interstate highway number. 

// As always, fully notated code is available on my github and shared in the description.

// Import Scanner Class and begin.
import java.util.Scanner;

public class InterstateHighwayNumbers {
   public static void main(String [] args) {
      
      
      
   }
}