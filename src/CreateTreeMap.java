import java.util.TreeMap;

public class CreateTreeMap
{
	public static void main (String[]args)
	{
		TreeMap<String, String> titlesGames = new TreeMap<String, String>();
		titlesGames.put("Ocarina of Time", "Nintendo 64");
		titlesGames.put("Perfect Dark", "Nintendo 64");
		titlesGames.put("Final Fantasy 8", "Playstation 2");
		titlesGames.put("Black Dahlia", "Pc");
		titlesGames.put("Princess Twilight", "Game Cube");
		titlesGames.put("Deus Ex Mankind Divided", "Playstation 4");
		titlesGames.put("Skyrim", "Playstation 3");

		System.out.println("TreeMaps's Size: " + titlesGames.size());
		for (String tg : titlesGames.keySet())
		{
			System.out.println("Game: " + tg + " || Plattaform: " + titlesGames.get(tg));
		}
	}
}
