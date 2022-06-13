package labfour;

import java.util.Scanner;

public class QuestionThreeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first integer");
		int a = sc.nextInt();
		System.out.println("Please enter your second integer");
		int b = sc.nextInt();
		System.out.println("Please enter your last integer");
		int c = sc.nextInt();
		greenTicket(a, b, c);
	}

	public static int greenTicket(int a, int b, int c) {
		int result = 0;
		if (a == b && a == c) {
			result = 20;
		} else if (a == b && a != c || c == b && a != b || a == c && b != c) {
			result = 10;
		} else {
			result = 0;
		}
		System.out.println("The result is " + result);
		return result;
	}

}
