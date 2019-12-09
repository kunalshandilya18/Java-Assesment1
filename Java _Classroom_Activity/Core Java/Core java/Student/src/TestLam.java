import java.util.function.Consumer;

public class TestLam {
	public static void main(String[] args) {
		
		Student s=new Student("Divya", 56.4, 22);
		
		Consumer<Student>c= x->{
			System.out.println("Name is "+x.name);
			System.out.println("Percentage is "+x.percent);
			System.out.println("Age  is "+x.age);
		};
		c.accept(s);
	}

}
