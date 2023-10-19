package 회원정보;

import javax.swing.JOptionPane;

public class 회원정보UI테스트 {
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");

		MemberDAO dao = new MemberDAO();
		
		// 데이터 가방을 주는 쪽
		// 1. 가방 만들기
		MemberVO bag = new MemberVO();

		// 2. 가방에 넣기
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		// 3. 가방 전달
		dao.insert(bag);
	}
}
