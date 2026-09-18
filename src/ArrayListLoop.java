import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLoop
{
	public static void main (String[]args)
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zelda");
		names.add("Horizon Zero Dawn");
		names.add("Perfect Dark");
		names.add("Goofy Troop");
		names.remove(1);

		Collections.sort(names);
		for (int i = 0;  i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
	}
}
