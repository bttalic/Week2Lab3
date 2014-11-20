
public class BoatDistance {

	public static void main(String[] args) {
		
		//the conversion constant can be obtained with simple mathematical equations
		double conversionConstant = 1.60934;
		
		double boatSpeed, distance;
		System.out.println("Enter the speed of the boat in miles per hour");
		boatSpeed = TextIO.getDouble();
		
		boatSpeed *= conversionConstant;
		
		System.out.println("Enter the distance in kilometers");
		distance = TextIO.getDouble();
		
		System.out.println("The time required is " + (distance / boatSpeed));

	}

}
