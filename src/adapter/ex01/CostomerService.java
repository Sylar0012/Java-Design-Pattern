package adapter.ex01;

// 고객이 클레임이 들어오면, 
//사과 이메일 보내기
// 이메일 답장을 DB 저장하기
public class CostomerService {
	
	private EmailSend email;
	
	public CostomerService(EmailSend email) {
		this.email = email;
	}
	
	public void acceptClaim(String msg) {
		
		// 1. 클래임을 받는 책임이 있는 클래스
		String acceptMsg = msg;
		System.out.println("클레임 내용 : " + acceptMsg);
		// 2. 이메일 보내기
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 DB에 저장했습니다. : " + result);
	}

}
