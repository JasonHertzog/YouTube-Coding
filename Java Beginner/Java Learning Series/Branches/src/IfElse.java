public class IfElse {
	public static void main(String[] args) {
		// If-else branches (General)
		
		// Using branches in your code will allow you to execute certain statements when a specific condition is met.
		// Using an if branch will open up your program to many more possibilities.
		// Let's create some variables that'll be used throughout this video.
		int userHeight = 48; // Used in example 1 & 3.
		int pizzaSlices = 2; // Used in example 2.
		
		// Example 1: Are you tall enough (in inches) to ride the roller coaster alone?
		if (userHeight > 47) {
			System.out.println("You are tall enough to ride alone!");
		}
		
		
		// You can also have more than one if statement! Let's check out another example.
		// In the following example, we'll be using the equality operator (==).
		
		// Example 2: How many slices of pizza do you want?
		if (pizzaSlices == 1) {
			System.out.println("You get a slice of pizza.");
		}
		if (pizzaSlices == 2) {
			System.out.println("You get two slices of pizza.");
		}
		if (pizzaSlices > 2) {
			System.out.println("You were too greedy. You only get one slice of pizza.");
		}
		
		// Notice how if you want no slices of pizza, nothing at all happens. This will not cause an error and is okay.
		// Let's revisit the first example involving a roller coaster.
		// On many roller coasters, if you're at least 36 inches tall, you can ride the coaster with an adult.
		
		// Example 3: Are you at least tall enough to ride with a chaperone?
		if (userHeight > 47) {
			System.out.println("You are tall enough to ride alone!");
		}
		else if (userHeight > 35) {
			System.out.println("You may ride with an adult chaperone");
		}
		else {
			System.out.println("You are too short to ride.");
		}
		
		// Using "else if" and "else" gives you much more control.
		// The difference between else if and else is that else if is basically saying that if the previous conditions
		// didn't work, the program should check to see if this "else-if" condition is met.
		// Generally, an "else" without an if after it goes at the end of your branch sequence. An else statement is
		// a catch-all that does something when all of the preceding "if" and "else if" conditions are not met.
		
		// To practice, try creating if-else branches to make the following practice problem work:
		
		// Practice Problem: Create a program that determines if a credit score is high enough to get a new credit card.
		// Assume the credit card requires a 700+ for automatic approval and 620+ for a manual review.
		// Anything below 620 should be an automatic rejection.
		
		int creditScore;
		// Your code would go here!
		// When you're finished and ready to test it, use the following values and make sure the program works!
		// You'll test each of these one at a time, and make sure to put these BEFORE your branches.
		
		//	creditScore = 700; // (Should be Auto approve)
		//	creditScore = 699; // (Should be manual approve)
		//	creditScore = 620; // (Should be manual approve)
		//	creditScore = 619; // (Should be auto rejection)
		
		// Example of how to format it.
		int exampleScore;
		exampleScore = 620;
		if (exampleScore > 4) {
			System.out.println("The example is greater than 4.");
		}
		
		// If all 4 of those work as expected, you have created the program correctly and you deserve apple pie!
		
		

	}

}
