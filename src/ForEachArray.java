public class ForEachArray
{
	public static void main (String[]args)
	{
		// int[] grade = new int[5]
		int[] grade = {1,2,3,4,5};
		int sizeArray = grade.length;
		
		for (int g : grade)
		{
			System.out.println(g);
		}
	}
}
