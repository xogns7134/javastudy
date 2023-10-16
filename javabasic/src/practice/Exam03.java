package practice;

import javax.swing.JOptionPane;

public class Exam03 {
	public static void main(String[] args) {
		String telecom = JOptionPane.showInputDialog(
				"통신사를 입력하세요.");
		String number = JOptionPane.showInputDialog(
				"번호를 입력하세요.");
		String name = JOptionPane.showInputDialog(
				"이름을 입력하세요.");
		String total = name+"님은 "+telecom+"에 "+
				number;
		JOptionPane.showMessageDialog(null,
				total+"로 가입되셨습니다.");
	}
}
