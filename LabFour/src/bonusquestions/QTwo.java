package bonusquestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QTwo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a temperature");
			int temperature = sc.nextInt();
			System.out.println("Is it summer: True or False?");
			boolean isSummer = sc.nextBoolean();
			squirrelPlay(temperature, isSummer);
		}
		catch (InputMismatchException e) {
			System.out.println("Please follow the directions");
		}
	}

	public static boolean squirrelPlay(int temperature, boolean isSummer) {
		boolean doTheyPlay;
		if (isSummer && 60 <= temperature && temperature <= 100) {
			doTheyPlay = true;
			System.out.println(doTheyPlay + " they play");

		} else if (!isSummer && 60 <= temperature && temperature <= 90) {
			doTheyPlay = true;
			System.out.println(doTheyPlay + " they play");

		} else {
			doTheyPlay = false;
			System.out.println(doTheyPlay + " they do not play");
		}

		return doTheyPlay;

	}

}
