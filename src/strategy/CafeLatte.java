package strategy;

public class CafeLatte implements Coffee {
	
	private final String NAME = "카페라떼";
	
	@Override
	public String make() {
		return NAME;
	}
}
