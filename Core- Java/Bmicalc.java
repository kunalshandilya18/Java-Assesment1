class Bmicalc
{
	public static void main(String ar[])
	{
		int w=65;
		double h=1.75;
		double BMI=w/(h*h);
		if(BMI>30)
		System.out.println("Obese");
		else if(BMI>=25 && BMI<=30)
		System.out.println("Over weight");
		else if(BMI>=18.5 && BMI<25)
		System.out.println("Normal");
		else 
		System.out.println("Under weight");
	}
}