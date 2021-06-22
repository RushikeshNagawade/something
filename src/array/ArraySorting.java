package array;
import java.util.ArrayList;

public class ArraySorting {
	
		  public static void main(String[] args) {
		    ArrayList<Integer> whatANumber = new ArrayList<Integer>();
		    whatANumber.add(5);
		    whatANumber.add(9);
		    whatANumber.add(8);
		    whatANumber.add(1);
		    System.out.println(whatANumber);
		   for(int e : whatANumber) {
			   System.out.println(e);
		   }
		    whatANumber.forEach( (n) -> { System.out.println(n); } );
		    whatANumber.forEach((n)-> {System.out.println(n);});
		  }
		}

