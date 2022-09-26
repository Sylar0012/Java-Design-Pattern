package singleton;


public class President {
	
	private static President instance = new President("홍길동");
	
	public static President getInstance() {
		return instance;
	}
	
	private String name;
	
	private President(String name) {
		this.name = name;
	}
}
