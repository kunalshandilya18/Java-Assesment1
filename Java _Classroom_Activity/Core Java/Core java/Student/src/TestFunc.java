import java.util.function.Function;

public class TestFunc {
	public static void main(String[] args) {
		
		
		Function<String, Integer> fn=x->x.length();
		int ans=fn.apply("Priya");
		System.out.println("Length is "+ans);
			
		

	}
}
