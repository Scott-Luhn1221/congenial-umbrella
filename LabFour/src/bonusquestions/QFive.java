package bonusquestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QFive {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the phrase you want to copy");
			String str = sc.next();
			System.out.println("Please enter the amount of times you want to copy");
			int copy = sc.nextInt();
			copyString(str, copy);
		}
		catch (InputMismatchException e) {
			System.out.println("Please follow the directions");
		}
		
	}

	public static String copyString(String str, int copy) {
		String copyStr = "";
		for (int i = 0; i < copy; i++) {
			copyStr += str;

		}
		System.out.println(copyStr);
		return copyStr;
	}
}