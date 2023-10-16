package practice;

import javax.swing.JOptionPane;

public class Exam02 {
	public static void main(String[] args) {
		//키가 199.9 일 때 적정 몸무게
		//식은 (키 - 100)*0.9
		String height = JOptionPane.showInputDialog(
				"키를 입력하세요.");
		double height1 = Double.parseDouble(height);
		double weight = (height1 - 100)*0.9;
		JOptionPane.showMessageDialog(null,
				"적정 몸무게는 "+String.format("%.2f",weight)
				+"kg 입니다.");
	}
}
