package proxy;

public class ProxyApp {

	public static void main(String[] args) {
		//BlogServer s = new BlogServer();
		ProxyServer ps = new ProxyServer(new BlogServer());
		ps.request();
		
	}
}
