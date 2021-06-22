package practise;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
	int a = 12, b = 100 , c= 10;
	int result = 0;
	
	// ternary operator
	// if a is greater than b, if a is greater than c then ans is a else ans is c else if b is greater than c then b else c.
	
//	result = a > b ? a > c ? a : c : b > c ? b : c;
//	
	if ( a > b ) {
		if ( a > c) {
			result = a;
		} else { 
			result = c;
		}
	} else {
		if ( b > c) {
			result = b;
		} else {
			result = c;
		}
	}
	System.out.println("largest of the three number is " + result);

}
}