// if 	 input: Michael Jordan 1963
// then	output: Your login name: JordaM63
// if    input: Kanye West 2020
// then output: Your login name: WestK20

import java.util.Scanner;

public class LoginName {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String fName = scnr.next();
		String lName = scnr.next();
		int digits = scnr.nextInt();
		
		// Prepare digits for username.
		digits = digits % 100;
		
		// Do logic.
		if (lName.length() >= 5) {
			System.out.println("Your login name: " + lName.substring(0, 5) + fName.charAt(0) + digits);
		} else
			System.out.println("Your login name: " + lName + fName.charAt(0) + digits);
		
	}
} 