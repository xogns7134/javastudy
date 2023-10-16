package control.conditional;

public class String_comparison {
	public static void main(String[] args) {
		String pass = "password";
		//기본형만 == 연산자를 통해 값을 비교 가능
		//문자열은 참조형이기에 eqauls 사용
		
		if (pass.contentEquals("password")) {
			System.out.println("승인되었습니다.");
		}
		else {
			System.out.println("잘못된 비밀번호입니다.");
		}
	}
}
