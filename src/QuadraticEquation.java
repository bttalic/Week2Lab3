
public class QuadraticEquation {

	public static void main(String[] args) {
		/*
		 * we will again use variable names a,b and c
		 * as these are the names commonly used in maths
		 */
		
		double a, b, c;
		System.out.println("Enter coeficient a: ");
		a = TextIO.getDouble();
		System.out.println("Enter coeficient b: ");
		b = TextIO.getDouble();
		System.out.println("Enter coeficient c: ");
		c = TextIO.getDouble();
		
		if ( a == 0 ){
			double result = -c / b;
			System.out.println("The solution is: " + result);
		} else {
			double d = b * b - 4 * a * c;
			if ( d < 0 ){
				System.out.println("The solution is a complex value");
			} else {
				double result1 = - b + Math.sqrt(d),
					   result2 = - b - Math.sqrt(d);
				System.out.printf("The solutions are %.3f and %.3f", result1, result2);
			}
		}
	}

}
