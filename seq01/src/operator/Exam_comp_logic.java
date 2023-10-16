package operator;

import javax.swing.JOptionPane;

public class Exam_comp_logic {
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog(
				"온도를 입력하세요.");
		String wind = JOptionPane.showInputDialog(
				"바람세기를 입력하세요.");
		double temp1 = Double.parseDouble(temp);
		double wind1 = Double.parseDouble(wind);
		if (temp1 >= 30 || wind1 < 88) {
			System.out.println("양산을 들고가세요.");
		}
		else {System.out.println("양산을 챙길 필요 없습니다.");}
	}
}
