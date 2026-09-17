import java.io.File;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[]args)
	{
		try {
		File file = new File("newFile.txt"); // Only create a object file
		if (file.createNewFile()) // Here you create
		{
			System.out.println("File was created with sucess. " +  file.getName());
		} else 
		{
			System.out.println("File have exists");
		}
		} catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("Ocurr an error.");
		}
	}
}
