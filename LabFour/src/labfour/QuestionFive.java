package labfour;

import java.util.Scanner;

public class QuestionFive {

	public static void main(String[] args) {
		String str = "Hi";
		int copy = 4;
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
