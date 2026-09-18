interface GameIni
{
	public final int year = 1997;
	public final float build = 12.453f;
	public final String developer = "Rare";
	public final String companyBound = "Nintendo";
	
	public void showInformationGame();
	public void showInformationBuild();
}

interface GamePlay
{
	public final int numberPlayers = 1;
	public final String nameGame = "Blast Corps";
	
}

public class CreateInterface implements GameIni, GamePlay
{
	public void showInformationBuild()
	{
		System.out.println("Number Players: " + numberPlayers);
		System.out.println("Title: " + nameGame);
	}

	public void showInformationGame()
	{
		System.out.println("Launched Year: " + year);
		System.out.println("Version Build: " + build);
		System.out.println("Developer: " + developer);
		System.out.println("Company: " + companyBound);
	}

	public static void main (String[]args)
	{
		CreateInterface  app = new CreateInterface );
		app.showInformationGame();
		app.showInformationBuild();
	}
}
