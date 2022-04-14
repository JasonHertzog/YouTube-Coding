import java.util.Scanner;

public class Strings {
	public static void main(String [] args) {
		// Initialized scanner for taking input.
		Scanner scnr = new Scanner(System.in);
		
		// Strings in Java
		// A string is a sequence of characters and can be stored as a variable.
		// A string literal is surrounded by "Double Quotes"
		// Because of this, "24" is different than 24.
		// Here's an example outputting a string literal.
		System.out.println("This is literally a string literal.");
		// Let's make a String variable!
		String goal = "to like this video!";
		// Quick note: Notice that the 'S' in String is upper case! 
		// Now let's use our goal variable by outputting it.
		System.out.println("Your goal is " + goal);
		
		// Now let's get a String from the user!
		String name;
		// We're going to use the .next() scanner method to read a string up
		// until it sees a "whitespace character" (space/tab/newline)
		System.out.print("Enter your name: ");
		name = scnr.next();
		System.out.println("Hello " + name + "!");
		
		// Now let's get a goal in the form of a sentence from the user!
		// This time we'll use .nextLine() to INCLUDE whitespace characters.
		System.out.print("Enter a new goal: ");
		String newGoal = scnr.nextLine();
		System.out.println(name + ", your new goal is " + newGoal + "!");
		// Uh oh, it looks like Java didn't allow us to update the newGoal!
		// This is expected, since .next() leaves whitespace afterwards.
		// We'll need to clear the input before using .nextLine() in this case.
		// Let's delete the previous code, and retry with one additional line.
		scnr = new Scanner(System.in);
		System.out.print("Enter a new goal: ");
		String newGoal = scnr.nextLine();
		System.out.println(name + ", your new goal is " + newGoal + "!");
		
		// Awesome, we were able to reset the scanner after using the .next()
		// method. I think we're ready for a comprehension check!
		
		// COMPREHENSION CHECK
		// There are 3 errors. Find and fix them! 
		// *If you're unsure about integers, check out my other video on them!
		System.out.print("Enter \"4\": ");
		String a = scnr.next();
		String b = "2";
		System.out.printLine("This answer should be 42: " + (a + b));
		System.out.print("Nice! Now sign below to mark completed: ");
		// HINT: think about how we reset the scanner and made it new again...
		string signature = scnr.nextLine();
		System.out.println("This should be on a new line! If it is...");
		System.out.print("Good job, and nice signature " + signature + "!");
		
		// Answer, let's go over it together :)
		
		
	}
}
