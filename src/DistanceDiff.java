public class DistanceDiff {

	public static void main(String[] args) {

		double time, initialHeight, gravitationalConstant = 9.81;

		System.out.println("Enter initial height: ");
		initialHeight = TextIO.getDouble();
		
		System.out.println("Enter the time the body falls in minutes: ");
		time = TextIO.getDouble();

		double timeInSeconds = (int) (time * 60);
		
		double timeRequiredToHitGround = Math.sqrt( 2 * initialHeight / gravitationalConstant);
		
		if( timeInSeconds >= timeRequiredToHitGround ){
			//the body will hit the ground in the provided time
			System.out.println("The body will hit the ground");
		} else {
			System.out.println("The body needs to travel " + (timeRequiredToHitGround - timeInSeconds) + 
							   " seconds more ");
		}

		

	}

}
