public class EnumStruct
{
	public static void main (String[]args)
	{
		// CONSTANTS
		enum Grade
		{
			LOW, 
			MEDIUM,
			HIGH,
		}

		Grade g = Grade.LOW;
		System.out.println(g); // Output is LOW

	}
	  
}
