package proxy;

public class BlogServer implements Server {

	@Override
	public void request() {
		System.out.println("요청을 받음");
	}
	public void response() {
		System.out.println("응답을 받음");
	}
}
