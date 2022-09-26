package strategy;

public class App {

	public static void main(String[] args) {
		CoffeeMachine m = new CoffeeMachine();
		m.brew(new Americano());
		m.brew(new CafeLatte());
		m.brew(new CafeMoca());
		m.brew(new Espresso());
	}
}
