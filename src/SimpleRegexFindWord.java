import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SimpleRegexFindWord
{
	public static void main (String[]args)
	{

		Pattern pattern = Pattern.compile("Ellie Williams", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("The girl have a cure for disease, called Ellie Williams");
		boolean flagFind = matcher.find();

		if (flagFind)
		{
			System.out.println("Word found.");
		} else 
		{
			System.out.println("Can't find the word.");
		}
	}
}
