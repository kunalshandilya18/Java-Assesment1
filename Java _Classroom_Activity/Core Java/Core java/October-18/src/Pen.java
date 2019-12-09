
public abstract class Pen {
	int cost;
	void open() {
		System.out.println("Open");
	}
	abstract void color();
	abstract void write();

}
