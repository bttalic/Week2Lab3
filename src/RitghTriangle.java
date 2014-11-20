
public class RitghTriangle {

	public static void main(String[] args) {
		/*we can use variable names a,b and c
		 * as these notations are commonly used in mathematics
		 */
		double a, b, c;
		/* we will make sure that the side with the longest value
		 * is saved in variable a
		 */
		System.out.println("Enter side a of the triangle: " );
		a = TextIO.getDouble();
		
		System.out.println("Enter side b of the triangle: " );
		b = TextIO.getDouble();
		if( b > a) {
			double temp = b;
			b = a;
			a = temp;
		}
		
		System.out.println("Enter side c of the triangle: " );
		c = TextIO.getDouble();
		if( c > a){
			double temp = c;
			c = a;
			a = temp;
		}
		/*
		 *  in any right triangle, the square of the length of the 
		 *  hypotenuse equals the sum of the squares of the lengths
		 *   of the two other sides
		 */
		
		if ( a * a == b * b + c * c){
			System.out.println("The triangle is right angled");
		} else {
			System.out.println("The triangle is not right angled");
		}

	}

}
