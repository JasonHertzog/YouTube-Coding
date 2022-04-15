
public class NumericDataTypes {

	public static void main(String[] args) {
		// Numeric Dates Type & Overflows
		// There are 6 numeric data types to know about in Java.
		// 4 of them are integer numbers, and 2 are floating point numbers.
		// We'll go over the 4 integer numbers, and discuss the max values.
		byte smallestByte = -128;
		byte biggestByte = 127;
		System.out.printf("Byte range: [%d, %d]", smallestByte, biggestByte);
		// Anything smaller than -128 or bigger than 127 would cause an error.

		// Shorts are bigger than bytes but smaller than integers.
		short smallestShort = -32768;
		short biggestShort = 32767;
		System.out.printf("\nShort range: [%d, %d]", smallestShort,
				biggestShort);

		// Now we move on to the most popular integer type, int
		int smallestInt = -2147483648;
		int biggestInt = 2147483647;
		System.out.printf("\nInt range: [%d, %d]", smallestInt, biggestInt);

		// The final integer data type is a long, and it's HUGE.
		// NOTE: It is appropriate to put an 'L' at the end of a long number.
		// It's considered good practice to make sure it's upper case.
		long biggestLong = -9223372036854775808L;
		long smallestLong = 9223372036854775807L;
		System.out.printf("\nLong range: [%d, %d]", smallestLong, biggestLong);

		// Now we move onto the 2 floating-point numbers.
		// Floats are the smaller of the two, and must end with an 'f'
		// They have 7 significant digits.
		float smallestFloat = -3.4e-038f;
		float biggestFloat = 3.4e+038f;
		System.out.printf("\nFloat range: [%.6f, %.6f]", smallestFloat,
				biggestFloat);
		
		// Double's are the more commonly used floating-types, and have up to
		// 16 significant digits of accuracy.
		// These numbers can be HUUUUUUUUGE.
		double smallestDouble = -1.7e-308 ;
		double biggestDouble = 1.7e+308 ;
		System.out.printf("\nDouble range: [%.15f, %.15f]", smallestDouble,
				biggestDouble);
		
		// Reminder: The two most common numeric types to use are: int & double
		
		// Any number that brings these numeric data types outside of the ranges
		// shown will cause an error. You generally don't need to worry about
		// Bytes, Shorts, or Floats. However they can be useful on cheap 
		// embedded systems that are outside the scope of what you need to know.
		
		// Comprehension Check
		// (3 Situations: Pick the most suitable numeric data type for the job)
		
		// #1) To store a user's age, a _____ would be sufficient.
		// #2) To hold the number of seconds in a day, a _____ would be good.
		// #3) To hold a value that would be used to land a space shuttle on the
		//	   moon, a _______ would be the only correct and accurate choice.

		// Answers
		// #1) Byte (or when in doubt: Int!)
		// #2) Int
		// #3) Double
	}

}
