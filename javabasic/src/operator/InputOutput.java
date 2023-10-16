package operator;

import javax.swing.JOptionPane;

public class InputOutput {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(
				"이름을 입력해보세요.");
		String hobby = JOptionPane.showInputDialog(
				"취미를 입력해보세요.");
		String time = JOptionPane.showInputDialog(
				"기상시간을 입력해보세요.");
		JOptionPane.showMessageDialog(null,
				"내 이름은 "+name+"이고 취미는 "+hobby+
				"이다. 아침에는 보통 "+time+"시에 일어난다.");
		
	}
}
// 기본형 타입
// 논리형 => boolean : true, false 2가지 중 하나의 값을 가진다.
// 정수형 => byte, short, int, long : 정수 값을 가진다. 순서는 byte순
// 실수형 => float, double : 실수 값을 가진다. 순서는 byte순
// 문자형 => char : 한 글자의 문자 값을 가진다.
// 참조형 타입
// 문자열 => String : ""안에 들어가는 문자열 값을 가진다.
