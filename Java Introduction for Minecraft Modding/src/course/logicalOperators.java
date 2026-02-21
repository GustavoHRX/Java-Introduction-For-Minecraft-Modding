package course;

public class logicalOperators {

	public static void main(String[] args) {
		/*BOOLEAN AND LOGICAL OPERATORS*/
		
		boolean likedThisVideo=true;
		boolean commented=false;
		boolean dislikedVideo=false;
		
		
		//Logical operators
		// &&
		// ||
		// !
		
		//Theres two separate ways to writing logical operators
		boolean superFan = likedThisVideo && commented;
		boolean fan = likedThisVideo || commented;
		boolean hater = !fan; //oposite
		boolean superHater = hater && dislikedVideo;
		
		superHater = !(likedThisVideo || commented) && dislikedVideo;

	}

}
