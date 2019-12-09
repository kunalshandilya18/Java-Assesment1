
public class Tiuchpad implements Mouse, Keyboard {

	@Override
	public void press() {
		System.out.println("I am key press");
	}

	@Override
	public void click() {
		System.out.println("I am mouse click");

	}

}
