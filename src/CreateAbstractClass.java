abstract class SystemSun
{
	public int numberPlanets = 8;
	public String[] namesPlanets = new String[8];
	public abstract void countPlanets();
}

class PlanetEarth extends SystemSun
{
	public PlanetEarth()
	{
		namesPlanets[0] = "Mars";
		namesPlanets[1] = "Earth";
		namesPlanets[2] = "Mercury";
		namesPlanets[3] = "Venus";
		namesPlanets[4] = "Saturn";
		namesPlanets[5] = "Jupiter";
		namesPlanets[6] = "Neptune";
		namesPlanets[7] = "Uranus";
	}
	public void countPlanets()
	{
		System.out.println("Total: " + numberPlanets);
		for (String p : namesPlanets)
		{
			System.out.println(p);
		}
	}
}

public class CreateAbstractClass
{
	public static void main (String[]args)
	{
		PlanetEarth earth = new PlanetEarth();
		earth.countPlanets();
	}
}
