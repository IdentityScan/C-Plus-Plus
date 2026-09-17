import java.io.File;
import java.util.Scanner;

public class DeleteFile
{
	public static void main (String[]args)
	{
		Scanner deleteFileOption = new Scanner(System.in);
		File file = new File("newFile.txt");
		System.out.println("Do you choose delete file? Digit 0 (yes) or 1 (no)");
		int opt = deleteFileOption.nextInt();
		
		if (opt == 0)
		{
			file.delete();
			System.out.println("The file deleted");
		} else if (opt == 1)
		{
			System.out.println("File don't deleted");
		} else
		{
			System.out.println("Please, input a valid option");
		}
		
	}
}
