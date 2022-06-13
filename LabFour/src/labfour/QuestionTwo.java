package labfour;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {

		int temperature = 60;
		boolean isSummer = false;
		squirrelPlay(temperature, isSummer);
		
	}
	public static boolean squirrelPlay(int temperature, boolean isSummer) {
	    boolean doTheyPlay;
		if(isSummer && 60 <= temperature && temperature <= 100) {
			doTheyPlay = true;
			System.out.println(doTheyPlay);
		
		} else if (!isSummer && 60 <= temperature && temperature <= 90) {
			doTheyPlay = true;
			System.out.println(doTheyPlay);
	
		} else {
			doTheyPlay = false;
			System.out.println(doTheyPlay);
		}

		return doTheyPlay;
		


	    	


	}
	
}
