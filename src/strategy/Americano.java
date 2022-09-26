package strategy;

public class Americano implements Coffee{
	
	private final String NAME = "아메리카노";
	
	@Override
	public String make() {
		return NAME;
	}
}
