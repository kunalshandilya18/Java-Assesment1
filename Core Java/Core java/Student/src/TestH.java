import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestH {
	public static void main(String[] args) {
		List<Integer>al= new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		Function<Integer, Integer>fn=x->x*10;
		List<Integer>bl=al.stream().map(fn).collect(Collectors.toList());
		
		System.out.println(bl);
		
	}

}
