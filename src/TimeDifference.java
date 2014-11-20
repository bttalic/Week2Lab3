public class TimeDifference {

	public static void main(String[] args) {
		/*
		 * This problem could have been (and is accepted) solved by getting
		 * different entries for hours, minutes, and seconds for two times
		 * For this problem we will asume that the first entered time is the start
		 * and the second entered time the finish
		 */

		System.out.println("Enter the first time, separate values with :");
		String firstTimeString = TextIO.getlnString();

		System.out.println("Enter the second time, separate values with :");
		String secondTimeString = TextIO.getlnString();

		int firstH, firstM, firstS;

		// we will need this index to get the according substring
		int indexOfSeparator = firstTimeString.indexOf(":");
		/*
		 * the substring value is parsed to get the numeric value
		 */
		firstH = Integer.parseInt(firstTimeString
				.substring(0, indexOfSeparator));

		// Now we can delete the first part of the string
		firstTimeString = firstTimeString.substring(indexOfSeparator + 1);

		// repeating the previous operations to get the rest of the time part
		// for both times
		// minutes
		indexOfSeparator = firstTimeString.indexOf(":");
		firstM = Integer.parseInt(firstTimeString
				.substring(0, indexOfSeparator));
		firstTimeString = firstTimeString.substring(indexOfSeparator + 1);

		// seconds, the reminder of the string has to be the value for seconds
		firstS = Integer.parseInt(firstTimeString);

		int secondH, secondM, secondS;

		// we will need this index to get the according substring
		indexOfSeparator = secondTimeString.indexOf(":");
		/*
		 * the substring value is parsed to get the numeric value
		 */
		secondH = Integer.parseInt(secondTimeString.substring(0,
				indexOfSeparator));

		// Now we can delete the second part of the string
		secondTimeString = secondTimeString.substring(indexOfSeparator + 1);

		// repeating the previous operations to get the rest of the time part
		// for both times
		// minutes
		indexOfSeparator = secondTimeString.indexOf(":");
		secondM = Integer.parseInt(secondTimeString.substring(0,
				indexOfSeparator));
		secondTimeString = secondTimeString.substring(indexOfSeparator + 1);

		// seconds, the reminder of the string has to be the value for seconds
		secondS = Integer.parseInt(secondTimeString);
		
		int hoursDifference, minutesDifference, secondsDifference;
		
		secondsDifference = secondS - firstS;
		minutesDifference = secondM - firstM;
		hoursDifference = secondH - firstH;
		
		if( secondsDifference < 0){
			secondsDifference += 60;
			minutesDifference--;
		}
		
		if( minutesDifference < 0){
			minutesDifference += 60;
			hoursDifference--;
		}
		

		System.out.printf("The first time is %d : %d : %d \n"
						+ "The first time is %d : %d : %d \n"
						+ "The time passed is: %d : %d : %d",
						firstH, firstM, firstS,
						secondH, secondM, secondS,
						hoursDifference, minutesDifference, secondsDifference  );
	}

}
