package course;

public class booleanComparisons {

	public static void main(String[] args) {

		
		/*booleans*/
		boolean myChannelWillBlow =true;
		boolean amITired=false;
		
		System.out.println("This is true: "+myChannelWillBlow);
		System.out.println("This is false: "+amITired);
		
		/*Comparison Operators*/
		//> >= == != < <=
		
		int personalScore = 100;
		
		boolean passedScore = personalScore >=50;
		System.out.println("You passed with the score of "+personalScore);
		
		boolean biggerScoreToPass = personalScore <= 100;
		System.out.println("You have not passed the other exam, you've scored "+personalScore+" points!");
		
		boolean differentScore = personalScore != 0;
		System.out.println("Your score is different than 0! Congrats!");
		
		boolean perfectScore = personalScore == 100;
		System.out.println("You've got the P.E.R.F.E.C.T Score");
		
		
	}

}
