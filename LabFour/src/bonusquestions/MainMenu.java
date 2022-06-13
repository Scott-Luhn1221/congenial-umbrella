package bonusquestions;

import java.util.Scanner;


public class MainMenu {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("********* Question Choice *******");

		System.out.println("1 = Question 1: Sum Limit ");
		System.out.println("2 = Question 2: Squirrel Play ");
		System.out.println("3 = Question 3: Lottery Ticket ");
		System.out.println("4 = Question 4: Finding xx ");
		System.out.println("5 = Question 5: Repeated String ");
		System.out.println("6 = Quit");

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("");
			System.out.print("Please select a number: ");

			switch (input.nextInt()) {

			case 1:
				System.out.println("This is Question 1: Sum Limit Method");
				QOne.main(args);
				break;

			case 2:
				System.out.println("This is Question 2: Squirrel Play");
				QTwo.main(args);
				break;

			case 3:
				System.out.println("This is Question 3: Lottery Ticket");
				QThree.main(args);
				break;

			case 4:
				System.out.println("This is Question 4: Finding xx");
				QFour.main(args);
				break;
				
			case 5:
				System.out.println("This is Question 5: Repeated String");
				QFive.main(args);
				break;
				
			case 6:
				System.out.println("Thank you and have a good day");
				break;
				
			default:
				System.out.println("Your selection is invalid");
				break;
			}
		}

	}

{
	
	}

}
