package singleton;

public class App {
	
	public static void main(String[] args) {
		
		President p1 = President.getInstance();
		
		President p2 = President.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
