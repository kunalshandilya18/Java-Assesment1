class Methd
{
	static int fact(int a)
	{
		int f=1;
		for(int i=1;i<=5;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String ar[])
	{
		int j=fact(5);
		System.out.println(j);
	}
}