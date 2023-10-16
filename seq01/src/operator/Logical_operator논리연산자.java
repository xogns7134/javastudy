package operator;

import javax.swing.JOptionPane;

public class Logical_operator논리연산자 {
	public static void main(String[] args) {
		// &&, ||, !
		String id = "Daeyorkya";
		String pw = "daeyorkya";
		
		String id1 = JOptionPane.showInputDialog(
				"ID를 입력하세요.");
		String pw1 = JOptionPane.showInputDialog(
				"PW를 입력하세요.");
		if (id.equals(id1) && pw.equals(pw1)) {
			System.out.println("로그인 되었습니다.");
		}
		else {System.out.println("잘못된 ID 혹은 비밀번호 입니다.");}
		
	}
}
