import java.util.function.Predicate;

public class TestStudent {
	public static void main(String[] args) {
		
		
		Student student=new Student("Divya", 56.2, 22);
		Predicate<Student> predicate=s->{
			if(s.percent>=35) {
				return true;
			}else {
				return false;
			}
		};
		boolean ans=predicate.test(student);
		System.out.println("Result is "+ans);
	}

}
