package practise;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int input = sc.nextInt();
		sc.close();
		
		for (int i =input;i>0; i=i-2) 
			System.out.println(i);

}
}