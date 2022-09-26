package proxy;

public class ProxyServer implements Server {
	
	private Server server;
	
	public ProxyServer(Server server) {
		this.server = server;
	}

	@Override
	public void request() {
		System.out.println("json을 자바오브젝트로");
		server.request();
		System.out.println("자바오브젝트를 json으로");
	}

	
}
