package bonusquestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QFour {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a string with repeating x's");
			String str = sc.next();
			countString(str);
		}
		catch (InputMismatchException e) {
			System.out.println("Please follow the directions");
		}
	}

	public static int countString(String str) {

		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.substring(i, i + 2).equals("xx"))
				count++;

		}
		System.out.println("The total number of overlapping x's is " + count);
		return count;

	}

}