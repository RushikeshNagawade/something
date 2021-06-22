package mcqPractise;

public class Main {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]){
		try {
			throw 10;
		}
		catch (int e) {
			System.out.println("Got the exception" + e);
		}
		
	}

}
