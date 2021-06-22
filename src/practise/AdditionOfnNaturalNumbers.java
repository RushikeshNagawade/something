package practise;
import java.util.Scanner;

public class AdditionOfnNaturalNumbers {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int i, sum = 0;
	sc.close();
	for(i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("Addition of first " +n+ " natural nos = " +sum);

}
}