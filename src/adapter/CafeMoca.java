package adapter;

public class CafeMoca implements Coffee {
	
	private final String NAME = "카페모카";
	
	@Override
	public String make() {
		return NAME;
	}
}
