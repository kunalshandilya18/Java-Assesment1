class Demo
{
	public static void main(String []ar)
	{
		int a=2;
		int b=5;
		int c=4;
		int x=a>b&&a>c?a:b>a&&b>c?b:c;
		System.out.println("Largest no is "+x);
	}
}