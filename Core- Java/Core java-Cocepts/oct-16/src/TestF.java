
public class TestF {
	public static void main(String[] args) {
		Demo.j=5;
		Demo.run();
		Demo d=new Demo();
		d.eat();
		d.i=9;
		System.out.println(Demo.j);
		System.out.println(d.i);
	}

}
