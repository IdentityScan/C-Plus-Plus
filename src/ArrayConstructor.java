public class ArrayConstructor
{
	public static void main (String[]args)
	{
		// Constructor Array with size
		int[] value = new int[5];
		value[0] = 10;
		value[1] = 2;
		value[2] = 4;
		value[3] = -2;
		value[4] = 0;

		for (int i =0; i < value.length; i++)
		{
			System.out.println(value[i]);		
		}
	}
}
