import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
	public static void main(String[]args)
	{
		File file = new File("newFile.txt");
		try (Scanner getFile = new Scanner(file))
		{
			while (getFile.hasNextLine())
			{
				String content = getFile.nextLine();
				System.out.println(content);
			}
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Can't read file.");
		}
	}
}
