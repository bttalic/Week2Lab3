
public class FreeFall {

	public static void main(String[] args) {
		//we will assume the input time is in minutes
		double time, gravitationalConstant = 9.81;
		
		System.out.println("Enter the time in minutes: ");
		time = TextIO.getDouble();
		
		int timeInSeconds = (int)( time * 60 );
		
		//Math.pow(time,2) could have been used
		double distanceTraveled = gravitationalConstant * timeInSeconds * timeInSeconds / 2;
		
		System.out.println("The covered distance is " + distanceTraveled);

	}

}
