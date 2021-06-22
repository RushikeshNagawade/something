package mcqPractise;

import java.util.regex.Pattern;

public class Try2 {
	public static void main(String[] args) {
		String input = "Hello Welcome";
		String pattern = "Hello Welcome";
		boolean flag = Pattern.matches(pattern, input);
		System.out.println(flag);

		int[] arr = new int [5];
		arr = new int[6];
		System.out.println(arr[4]);
		System.out.println(java.time.LocalDate.now());
	StringBuffer s1 = new StringBuffer("Hello World");
	s1.insert(6, "Good");
	System.out.println(s1);
	}

}
