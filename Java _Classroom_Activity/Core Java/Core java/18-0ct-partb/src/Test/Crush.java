package Test;

public class Crush {
	void recive(Phone p) {
		if(p instanceof MI) {
			System.out.println("Thank you brother");
		}
		else if(p instanceof Pixel) {
			System.out.println("Thank you Dear");
		}
		else if(p instanceof Iphone) {
			System.out.println(" I love you");
		}
		else {
			System.out.println("Nonsense");
		}
	}  

}