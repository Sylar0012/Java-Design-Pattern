package adapter;

public class AmericanoAdapter implements Coffee{
	
	private Americano americano;
	
	public AmericanoAdapter(Americano americano) {
		this.americano = americano;
	}

	@Override
	public String make() {
		System.out.println("시럽추가");
		return americano.make();
	}
	
}
