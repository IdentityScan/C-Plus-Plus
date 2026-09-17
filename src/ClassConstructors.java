class Example1
{
	public int valuex;

	public Example1()
	{
		valuex = 1;
	}

	public Example1(int inputx)
	{
		valuex = inputx;
	}

	void showInformation()
	{
		System.out.println(valuex);
	}
}


public class ClassConstructores
{
	public static void main (String[]args)
	{
		Example1 ex1 = new Example1();
		Example1 ex2 = new Example1(2);

		 ex1.showInformation();
		 ex2.showInformation();
	}
	  
}
