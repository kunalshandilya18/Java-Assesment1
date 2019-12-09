import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		
		
		List<Integer>al= new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);

		Predicate<Integer> pr=i->i%2!=0;
		List<Integer>bl=al.stream().filter(pr).collect(Collectors.toList());
		
		
		System.out.println(bl);
	}

}

