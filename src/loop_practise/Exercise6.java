package loop_practise;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int input = sc.nextInt();
		Exercise6 obj = new Exercise6();
		obj.calculateDifference(input);
		sc.close();

	}

	public void calculateDifference(int input) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int difference = 0;

		for (int i = 1; i <= input; i++) {
			sumOfSquares += (i * i);
//			System.out.println(i);
			squareOfSum += i;

		}
		squareOfSum = squareOfSum * squareOfSum;
		difference = squareOfSum - sumOfSquares;

		System.out.println("Sum of squares is: " + sumOfSquares);
		System.out.println("Square of sum is: " + squareOfSum);
		System.out.println("Difference is: " + difference);

	}

}
