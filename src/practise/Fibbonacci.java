package practise;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		Fibbonacci obj = new Fibbonacci();
		obj.getFibbonacciSeries(n);
		System.out.println("Exit");
		
	}
	public void getFibbonacciSeries(int num) {
		int a = 1;
		int b = 1;
//		System.out.print(a +"\t");
//		System.out.print(b +"\t");
		int c=0;
		for (int i = 0; i<num-2; i++) {
			
			c = a + b;
			
			a = b;
			b = c;
		}
		System.out.print(c +"\t");
		
	}

}
