package labfour;

public class QuestionFour {

	public static void main(String[] args) {
		String str = "abxx";
		countString(str);
	}

	public static int countString(String str) {

		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.substring(i, i + 2).equals("xx"))
				count++;

		}
		System.out.println(count);
		return count;

	}

}
