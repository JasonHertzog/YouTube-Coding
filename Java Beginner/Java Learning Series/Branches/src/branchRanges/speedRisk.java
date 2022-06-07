package branchRanges;

public class speedRisk {
	public static void main (String [] args) {
		int speed = 45;
		int speedLimit = 45; // This will be our limit.
		String risk = ""; // This will be used to print at the end.
		
		
		// Begin branching
		if (speed <= 45) {
			risk = "Safe";
		}
		else if (speed <= 50) {
			risk = "Mostly safe";
		}
		else if (speed <= 55) {
			risk = "Slightly risky";
		}
		else {
			risk = "Very risky";
		}
		// End of branches
		// Now we print the risk level.
		System.out.println("Risk level: " + risk);
		// You can change the speed variable at the top to see all of the different branches execute.
		// Ask questions in comments, see you on the next video!
		
		
	}

}
