
public class TriangleAreaAndAngle {

	public static void main(String[] args) {
		
		/*we can use variable names a,b and c
		 * as these notations are commonly used in mathematics
		 */
		int a, b, c;
		/* we will make sure that the side with the longest value
		 * is saved in variable a
		 */
		System.out.println("Enter side a of the triangle: " );
		a = TextIO.getInt();
		
		System.out.println("Enter side b of the triangle: " );
		b = TextIO.getInt();
		if( b > a) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		System.out.println("Enter side c of the triangle: " );
		c = TextIO.getInt();
		if( c > a){
			int temp = c;
			c = a;
			a = temp;
		}
		/*
		 * For 3 lengths to be sides of a triangle the following conditions needs to be satisfied
		 * the summ of any 2 sides has to be larger then the third side, and all lengths have to be positive
		 */
		if ( a > b + c && c > a + b && b > a + c && a > 0 && b > 0 && c > 0){
			/*
			 * we know that the largest angle will be oposite to the longest side which we made sure to be a
			 * the angle can be calculated according to the cosine rule
			 */
			double alpha = Math.acos( ( (b*b + c * c - a * a) / ( 2 * a * b) ) );
			//alpha is now in radians, let's convert it to degrees
			alpha = alpha * 180 / Math.PI;
			/*
			 * According to Heron's formula the area of a triangle is
			 * P = sqrt ( s(s - a)(s - b)(s - c) ) where s = (a + b + c)/ 2
			 */
			double s = (a + b + c) / 2;
			double area = Math.sqrt( s * (s - a) * (s - b) * (s - c) );
			System.out.printf(" The lengths %d, %d and %d can be sides of a triangle"
					        + " The largest angle is %.2f and the area is %.2f", a, b,c, alpha, area);		
		} else {
			System.out.println("These values can not be sides of a triangle");
		}
		
	}

}
