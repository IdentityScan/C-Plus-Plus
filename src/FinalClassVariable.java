class Example3
{
	public boolean flagActive = true;
}

// You can't inherit, because it's final
final class Example4 extends Example3
{
	public int valueA = 3;
}

// Final class can't inherit, but it's still create an object.

public class FinalClassVariable
{
	public static void main (String[]args)
	{
		final int MAX = 3; // Constant
		Example3 ex3 = new Example3();
		Example4 ex4 = new Example4(); // Here final class
		System.out.println(ex4.valueA);
		System.out.println(ex3.flagActive);
	}
}
