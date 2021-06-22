package loop_practise;

import java.util.Scanner;

public class TableCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int input = sc.nextInt();
		
		for (int j =1; j<=5; j++) {
			for (int i=1; i<= 10;i++) {
			int table = input * i;
			System.out.print(" " +table);
			}
		System.out.println();
		
		}
	} 

}
