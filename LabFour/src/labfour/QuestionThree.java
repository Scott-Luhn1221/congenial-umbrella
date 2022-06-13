package labfour;

public class QuestionThree {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 3;
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
