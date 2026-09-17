public class WhileCase
{
	public static void main (String[]args)
	{
		boolean flagcycle = true;
		int count = 10;

		while (flagcycle != false)
		{
			System.out.println("Countdown: " + count);
			if (count <= 0)
			{
				flagcycle = false;
			}	
			count--;
		}
	}
}
	
