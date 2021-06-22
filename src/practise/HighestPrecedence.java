package practise;
import java.util.*;

public class HighestPrecedence {
	public static void main(String[] args) {
		
	
	
	int x = 2;
	int y = 5;
	int z = 12;
	
	int exp1 = x+(z/x+(z%y)*(z-x)^2);
//	int exp2 = z/x+y*x-(y+x)%z;
//	int exp3 = 4/2+8*4-(5+2)%3;
	
	System.out.println(exp1);
	/*System.out.println(exp2);
	System.out.println(exp3);*/
	}
}
