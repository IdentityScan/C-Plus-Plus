import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Integer;

// This program is more complex, see below about methods used

/*LocalDateTime e DateTimeFormatter - Formats and Dates, Integer.parseInt conversion and use switch*/

public class DateInformation
{
	public static void main (String[]args)
	{
		LocalDateTime data = LocalDateTime.now();

		DateTimeFormatter patterndate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter patternwd = DateTimeFormatter.ofPattern("e");

		int optweekday = Integer.parseInt(data.format(patternwd));
		String finalformat = data.format(patterndate);

		switch(optweekday)
		{
			case 0:
				System.out.print("Weekday: Saturday |");	
				System.out.println("Date: " + finalformat);
				break;
			case 1:
				System.out.print("Weekday: Sunday |");	
				System.out.println("Date: " + finalformat);
				break;
			case 2:
				System.out.print("Weekday: Monday |");	
				System.out.println("Date: " + finalformat);
				break;
			case 3:
				System.out.print("Weekday: Tuesday |");	
				System.out.println("Date: " + finalformat);
				break;
			case 4:
				System.out.print("Weekday: Wednesday |");
				System.out.println("Date: " + finalformat);
				break;
			case 5:
				System.out.print("Weekday: Tursday |");	
				System.out.println("Date: " + finalformat);
				break;
			case 6:
				System.out.print("Weekday: Friday |");	
				System.out.println("Date: " + finalformat);
				break;
			default:
				System.out.println("Invalid weekday.");
		}

		
	}
}
