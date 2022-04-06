public class Active_Example {
	public static void main(String[] args) {
		// Integer Division, Modulo, and Type Conversions.
		// Let's take a look at 2 quick division equations that use integers.
		int x = 15;
		System.out.println("15 / 5 = " + (x / 5));
		System.out.println("15 / 4 = " + (x / 4) + " <-- (This isn't a bug)");
		// As you may know, 15 divided by 4 does not actually equal 3. However,
		// Since only integers were being used to divide, the remainder is
		// truncated (which just means it is shortened). 
		
		// So how do we get the missing fraction of a number back?
		// That's where this next operator comes in: modulo (%)
		System.out.println("15 % 4 = " + (x % 4) + " <-- (% sign is modulo)");
		// Now if we reverse the division and add the modulo, we arrive back at
		// our original and complete number: 15.
		System.out.println("Multiply and add to get: " + ((3*4) + 3));
		// The modulo is useful for finding remainders -- in fact that's what it
		// was made to find!
		
		// If you want the division to be more precise and not truncated, Java
		// has a way to do that as well! We need to convert the equation into
		// a floating-point type equation. Here's two ways we can do that!
		System.out.println("#1 Implicitly: " + (x / 4.0));
		System.out.println("#2 Explicitly: " + ((double)x / 4));
		// To convert it implicitly, just make sure at least one number in the
		// equation is already a double (it has a decimal point).
		// To convert it explicitly, type (double) in front of a number.
		
		// Two things to note: 
		// 1. You can type cast other variable types as well (like int).
		// 2. Avoid type casting AFTER an equation is solved. 
		
		// To see point 2 more clearly, lets revisit the equation above.
		System.out.println("Explicitly correct: " + ((double)x / 4));
		System.out.println("Explicitly incorrect: "+ (double)(x / 4));
		// These look nearly identical but give different results.
		// Remember (x / 4) will evaluate before the (double) type cast resolves
		// So you want to make sure to type cast a number or variable in the
		// equation to avoid a common beginner's mistake.
		
		
		// Comprehension Check [2 Questions]
		
		
		// Find and fix the errors!
		// #1 Students are evenly divided among busses. All students ride a bus.
		int students = 27;
		int busses = 2;
		System.out.print("The most amount of students on a single bus is: ");
		System.out.println((students / busses) + ".");
		//
		
		// #2 A teacher is calculating the exact average grade on her last test.
		// The first line is an array, and we'll learn about those later.
		int[] testScores = {95, 92, 85}; // This line is correct
		int sumOfScores = testScores[0] + testScores[1] + testScores[2];
		System.out.println("The EXACT average is: " + sumOfScores / 3);
		//
		
		// ANSWERS
		// Answer 1: Add the remainder with Modulo!
		System.out.print("The most amount of students on a single bus is: ");
		System.out.println((students / busses) + (students % busses) + ".");
		//
		
		// Answer 2: Type cast a variable/number to a double!
		System.out.println("The EXACT average is: " + (double)(sumOfScores / 3));
		
		// That's it! Check out the playlist to learn more Java!
		// Help us conquer YouTube by liking the video :)
		

	}
}
