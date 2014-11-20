
public class CoveringAPool {

	public static void main(String[] args) {
		//assuming the pool has diferent width, length and height
		
		int poolH, poolW, poolL;
		
		System.out.println("Enter the pool width: ");
		poolW = TextIO.getInt();
		
		System.out.println("Enter the pool length: ");
		poolL = TextIO.getInt();
		
		System.out.println("Enter the pool height: ");
		poolH = TextIO.getInt();
		
		int tileL, tileW;
		System.out.println("Enter the width of your tile: ");
		tileW = TextIO.getInt();
		
		System.out.println("Enter the length of your tile: ");
		tileL = TextIO.getInt();
		
		//pools consist out of 4 sides and a bottom
		int poolArea = (poolW * poolH) * 2 + (poolL * poolH) * 2 + poolL * poolW;
		int tileArea = tileW * tileL;
		
		double  numberOfTiles = (double)poolArea / tileArea;
		
		//round off to bigger number
		int numberOfTilesRound = (int) Math.ceil(numberOfTiles);
		
		System.out.println("You would need : " + numberOfTilesRound + " tiles");
		
	}

}
