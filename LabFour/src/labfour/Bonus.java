package labfour;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("********* Question Choice *******");

		System.out.println("1 = Question 1 ");
		System.out.println("2 = Question 2 ");
		System.out.println("3 = Question 3 ");
		System.out.println("4 = Question 4 ");
		System.out.println("5 = Question 5 ");
		System.out.println("6 = Quit");

		Scanner input = new Scanner(System.in);
		System.out.print("");
		System.out.print("Please select a number: ");

		switch (input.nextInt()) {

		case 1:
			System.out.println("This is Question 1");
			QuestionOneBonus.main(args);
			break;

		case 2:
			System.out.println("This is Question 2");
			QuestionTwoBonus.main(args);
			break;

		case 3:
			System.out.println("This is Question 3");
			QuestionThreeBonus.main(args);
			break;

		case 4:
			System.out.println("This is Question 4");
			QuestionFourBonus.main(args);
			break;
			
		case 5:
			System.out.println("This is Question 5");
			QuestionFiveBonus.main(args);
			break;
			
		case 6:
			System.out.println("Thank you");
			break;
			
		default:
			System.out.println("Your selection is invalid");
			break;
		}

	}

{
	
	}

}
