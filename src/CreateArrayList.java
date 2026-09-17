import java.util.ArrayList;
import java.util.Collections;

public class CreateArrayList
{
	public static void main (String[]args)
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zelda");
		names.add("Horizon Zero Dawn");
		names.add("Perfect Dark");
		names.add("Goofy Troop");

		Collections.sort(names);
		for (String n : names)
		{
			System.out.println(n);
		}
	}
}
