import java.lang.Character;

// Digit is numeric value 1,2,3,4,5
// Letter is text value a, b, c, D, E
// ____ none or whitespace values
// $%#@&* is Special Characters

public class CharacterValidator
{
	public static void main (String[]Args)
	{
		char value = '&'; // Input new value here
		
		if (Character.isDigit(value))
		{
			System.out.println("This character is a numeric value.");
		} else if (Character.isLetter(value))
		{
			if (Character.isLowerCase(value))
			{
				System.out.println("This Character is a text value and LowerCase.");
			} else 
			{
				System.out.println("This Character is a text value and UpperCase");
			}
			} else if (Character.isWhitespace(value))
			{
			System.out.println("This character is none.");
			} else 
			{
			System.out.println("This a special character value.");
			}
	}
}
