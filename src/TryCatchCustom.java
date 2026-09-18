public class TryCatchCustom
{
	public static void main (String[]args)
	{
		int[] numbers = { 1, 2, 3};
		try {
			System.out.println(numbers[3]);
			} catch (Exception e)
			{
				System.out.print("Type error: ");
				e.printStackTrace();
				System.out.println("\n\n All elements of Array");
				for (int n : numbers)
				{
					System.out.println(n);
				}
			}
	}
}
