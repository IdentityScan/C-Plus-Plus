public class MethodsAllTypes
{
	static void showInformation()
	{
		System.out.println("This method don't need create an object class on main.");
		System.out.println("Don't return value");
	}

	void showAnotherInformation()
	{
		System.out.println("This method need create an object class on main.");
		System.out.println("Don't return value");
	}

	// Return value, no arguments 
	static int value()
	{		
		return 2;
	}

	// With arguments and don't return value
	static void sum(int valuea, int valueb)
	{
		System.out.println(valuea + valueb);
	}

	public static void main(String[]args)
	{
		// Don't need create an object
		showInformation();
		int getValue = value();
		getValue += 1; // 2 + 1
		System.out.println(getValue); // Output 3
		sum(4,7);

		// Need create an object
		 MethodsAllTypes app = new MethodsAllTypes();
		app.showAnotherInformation();
	}
}
