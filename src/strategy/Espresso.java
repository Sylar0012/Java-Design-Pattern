package strategy;

public class Espresso implements Coffee {
	private final String NAME ="에스프레소";

	@Override
	public String make() {
		return NAME;
	}
	
	
}
