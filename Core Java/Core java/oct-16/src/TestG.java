
public class TestG {
	public static void main(String[] args) {
		Card r=new Card();
		Card k=new Card();
		Card m=new Card();
		r.swipe();
		k.swipe();
		r.swipe();
		m.swipe();
		m.swipe();
		System.out.println(Card.orgcount);
	}

}
