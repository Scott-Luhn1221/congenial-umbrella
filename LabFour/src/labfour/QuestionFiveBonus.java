package labfour;

import java.util.Scanner;

public class QuestionFiveBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the phrase you want to copy");
		String str = sc.next();
		System.out.println("Please enter the amount of times you want to copy");
		int copy = sc.nextInt();
		copyString(str, copy);
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