package loop_practise;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(n < 2) isPrime = false;
		System.out.println("isPrime " + isPrime);
	} 
	

}
