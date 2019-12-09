
public class Cow {
	Cow()
	{
		
		System.out.println("L");
	}
	Cow(int i)
	{
		this(2.4);
		System.out.println("P");
	}
	Cow(double r)
	{
		this();
		System.out.println("T");
	}

}
