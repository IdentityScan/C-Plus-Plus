import java.lang.String;

public class StringOperator
{
	public static void main (String[]args)
	{
		String name = "Horizon Zero Dawn";
		System.out.println("First letter: " + name.charAt(0));
		System.out.println("Last Letter: " + name.charAt(name.length() - 1));
	}
}
