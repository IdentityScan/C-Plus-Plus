import java.util.Scanner;

public class InputConsole
{
	public static void main (String[]args)
	{
		Scanner getValue = new Scanner(System.in);
		String input = getValue.nextLine();

		System.out.println(input);
	}
}
