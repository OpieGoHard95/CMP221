class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81;
		double intialVelocity = 0.0;
		double fallingTime = 10.0;
		double intialPosition = 0.0;
		double finalPosition = 0.0;
		finalPosition = 0.5 * (gravity * (fallingTime * fallingTime)) + (0 * fallingTime) + intialPosition;
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + "m.");
	}
}

// It tells me that after 10 second the objects position is 0.0 meters.

// After doing Part Two it gives me the correct answer :D
