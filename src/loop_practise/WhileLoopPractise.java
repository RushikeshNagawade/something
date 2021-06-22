package loop_practise;
import java.util.Scanner;
public class WhileLoopPractise {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			
			sum += lastDigit;
		}
		System.out.println("The sum of digits of " +n + " is " + sum);
	}

}
