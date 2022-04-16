// To use random numbers, you'll need to import the Random class.
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// Random numbers in Java
		// Similar to a Scanner, we need to create a Random generator object.
		// We'll call it "rand"
		Random rand = new Random();
		// Let's take a random integer from 0-9! To do this, we use .nextInt(10)
		// The 10 inside of nextInt() says we want to start at 0 and go up to 9.
		// It's important to remember that the count starts at 0.
		System.out.println("Random number [0-9] ---> " + rand.nextInt(10));
		// Note: We can also place this random number in a variable!
		int myRandomNumber = rand.nextInt(10);
		System.out.printf("My random number is ---> %d\n", myRandomNumber);
		// Another note: The numbers should be different! Each random instance
		// is different from each other!
		
		// Let's say you want a specific range. Let's say you want a value that
		// represents the numbers [30 -> 45]. Let's do this.
		int specificNumber = rand.nextInt(16) + 30;
		System.out.printf("%d is in the range 30 to 45.\n", specificNumber);
		// Let's see why this works.
		System.out.println("Minimum range: " + (0 + 30));
		System.out.println("Maximum range: " + (16 - 1 + 30));
		// Remember that the number generated randomly with .nextInt is (n - 1)
		// Which means n itself is not included. (In this case, 16 = 16 - 1 = 15
		
		// It is also conceptually relevant to know that numbers generated are
		// not actually random, but are instead pseudo-random. This means that
		// it appears random, but is actually using a "seed" that is generated
		// by using your machine's current time. Since time marches forward, the
		// seed will continue to be unique with each run. 
		
		// With that said, you may want to control randomness in your program.
		// This is possible by setting the seed, as I'll show you now.
		rand.setSeed(8675309);
		// Now, no matter how many times I run the line I'm about to create, it
		// will always be the same random number.
		int randNumber = rand.nextInt(9999999);
		int wildGuess = 895297;
		System.out.printf("The random number is: %d, and ", randNumber);
		System.out.printf("your wild guess was: %d\n", wildGuess);
		// I'm an excellent guesser when I know the answer beforehand!
		
		// Comprehension Check
		// 2 Questions
		
		// Question 1: How would you generate a random number between 1-10.
		
		// Question 2: How would you generate a random number between -10 & -20?
		
		
		// Answers (I'll make seeds to show bounds, but they weren't required)
		// Answer 1
		// Minimum bound
		rand.setSeed(0);
		// The next line is the one you should have came up with!
		int answer1 = rand.nextInt(10) + 1;
		System.out.println("Between 1 - 10: " + answer1);
		
		// Maximum bound
		rand.setSeed(9);
		answer1 = rand.nextInt(10) + 1;
		System.out.println("Between 1 - 10: " + answer1);
		
		// Answer 2
		// Note, the bounds MUST be positive! No matter, we can subtract.
		// Minimum bound
		rand.setSeed(0);
		// The next line is the one you should have came up with!
		int answer2 = rand.nextInt(11) - 20;
		System.out.println("Between -10 & -20: " + answer2);
		
		// Maximum bound
		rand.setSeed(12);
		answer2 = rand.nextInt(11) - 20;
		System.out.println("Between -10 & -20: " + answer2);
		
		// As you can see, setting the seed can be helpful for debugging!
		// That's all, please like the video and check out the play list!
		
		
	}

}
