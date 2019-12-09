
public class Student {
	int id;
	String name;
	double percentage;


	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}



	void display()
	{
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
		System.out.println("Percentage is "+percentage);
	}

}
