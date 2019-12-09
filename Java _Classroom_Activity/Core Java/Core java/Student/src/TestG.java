import java.util.ArrayList;
import java.util.function.Predicate;

public class TestG {
	public static void main(String[] args) {
		
		
		ArrayList<Integer>al= new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		ArrayList<Integer>bl=new ArrayList<Integer>();
		
		Predicate<Integer> pr=i->i%2!=0;
		
		for (Integer integer : al) {
			if(pr.test(integer)) {
				bl.add(integer);
			}
		}
		
		System.out.println(bl);
	}

}
