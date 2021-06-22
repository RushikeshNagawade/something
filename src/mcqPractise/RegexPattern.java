package mcqPractise;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Someone");
		Matcher matcher = pattern.matcher("Visit Someone!");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
			
		}else {
			System.out.println("Match not found");
		}
	}

}
