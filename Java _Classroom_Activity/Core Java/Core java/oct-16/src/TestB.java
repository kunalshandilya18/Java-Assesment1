
public class TestB {
	public static void main(String[] args) {
		Van v=new Van();
		v.cost=1000;
		v.model="v2";
		v.move();
		v.stop();
		System.out.println("Cost is "+v.cost);
		System.out.println("model is "+v.model);
	}

}
