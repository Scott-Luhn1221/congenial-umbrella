package labfour;

import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int a = sc.nextInt();
		System.out.println("Please enter an integer");
		int b = sc.nextInt();
		sumLimit(a, b);

	}

	public static int sumLimit(int a, int b) {
		int count = 0;
		int sum = a + b;
		int tempSum = a + b;
		int tempA = a;
		int aCount = 0;
		System.out.println("The sum of a and b is " + sum);

		for (; tempSum != 0; tempSum /= 10, ++count) {
		}
		System.out.println("The amount of digits in the sum is " + count);
		for (; tempA != 0; tempA /= 10, ++aCount) {
		}
		System.out.println("The amount of digits in a is " + aCount);
		if (aCount == count)

			System.out.println("The digits in the sum and a are equal so the answer is " +sum);
		else {
			System.out.println("The digits in sum are greater than a so the answer is " + a);
		}
		return sum;

	}

	{

	}
}
