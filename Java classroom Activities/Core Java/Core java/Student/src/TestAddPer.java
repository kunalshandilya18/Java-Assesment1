import java.util.function.Function;

public class TestAddPer {
	public static void main(String[] args) {
		
		Student student=new Student("Kunal",62.2, 22);
		Function<Student,Student> fn=x-> {
			x.percent=x.percent+4;
			return x;
		};
		Student t=fn.apply(student);
		System.out.println(t.percent);
	}

}
