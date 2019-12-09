import java.util.function.Supplier;

public class TestDumm {
	public static void main(String[] args) {
		
		Supplier<Student>sup=()->new Student("Dimple", 70.2, 21);
		Student s=sup.get();
		
		System.out.println("Name is "+s.name);
		System.out.println("Age is "+s.age);
		System.out.println("Percentage is "+s.percent);
	}

}
