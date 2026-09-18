public class InnerClass
{
	class Person
	{
		public final int MAX = 3;
		public final float MAX_IGNITE = 14.5f;
		public String fullName;

		public Person()
		{
			fullName = "Princess Zelda";
		}
	}
	public static void main (String[]args)
	{
		InnerClass app = new InnerClass();
		InnerClass.Person p = app.new Person();

		System.out.println(p.MAX);
		System.out.println(p.MAX_IGNITE);
		System.out.println(p.fullName);
	}
}
