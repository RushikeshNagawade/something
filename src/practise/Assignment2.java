package practise;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Light Colour");
	String input = sc.nextLine();

	if (input.equals("Red")) {
		System.out.println("Stop");
	}
	else if (input.equals("Yellow")) {
		System.out.println("Ready");
	}
	else if (input.equals("Green")) {
		System.out.println("Go");
	}
	else {
		System.out.println("Invalid Input");
	}

	}
}