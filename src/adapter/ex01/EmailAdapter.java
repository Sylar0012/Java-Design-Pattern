package adapter.ex01;

// 가짜 객체
public class EmailAdapter implements EmailSend {

	@Override
	public String send() {
		return "고맙습니다";
	}

}
