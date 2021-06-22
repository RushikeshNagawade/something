package practise;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println("Enter number");
		int b = sc.nextInt();
		sc.close();
		
		int result =1;
		for(int i = 0; i<b; i++) {
			result = result * a;
		}
		System.out.println(result);
		
	}

}
