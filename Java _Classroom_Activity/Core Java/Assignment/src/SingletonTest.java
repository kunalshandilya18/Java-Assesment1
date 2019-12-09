
public class SingletonTest {

	public static void main(String args[]) 
	{ 
		
		Singleton x = Singleton.getInstance(); 

		
		Singleton y = Singleton.getInstance(); 

		
		Singleton z = Singleton.getInstance(); 

		
		x.s = (x.s).toUpperCase(); 

		System.out.println( x.s); 
		System.out.println(y.s); 
		System.out.println(z.s); 
		System.out.println("\n"); 

		
		z.s = (z.s).toLowerCase(); 

		System.out.println(x.s); 
		System.out.println(y.s); 
		System.out.println(z.s); 
	} 
} 


