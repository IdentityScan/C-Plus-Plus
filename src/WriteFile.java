import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
	public static void main(String[]args)
	{
	try {
		FileWriter fw = new FileWriter("newFile.txt");
		fw.write("Some a data on newFile.");
		fw.close();
		System.out.println("File saved with sucess.");
		
		} catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("Ocurr an error.");
		}
	}
}
