package adapter.ex01;

import adapter.ex01.lib.Email;

public class Ex01App {

	public static void main(String[] args) {
		CostomerService CS = new CostomerService(new Email());
		CS.acceptClaim("맘에 안들어");
	}
}
