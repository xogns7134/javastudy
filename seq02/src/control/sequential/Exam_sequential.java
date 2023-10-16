package control.sequential;

import javax.swing.JOptionPane;

public class Exam_sequential {
	public static void main(String[] args) {
		// Exam1
		String weight = JOptionPane.showInputDialog("몸무게 입력");
		String height = JOptionPane.showInputDialog("신장 입력");
		double weight1 = Double.parseDouble(weight);
		double height1 = Double.parseDouble(height);
		double bmi = weight1 / (height1 * height1);
		System.out.printf("BMI지수는 %.4f 입니다.", bmi);
		System.out.println("\n");
		// Exam2
		double point = 3000;
		double extrapoint = 33.3;
		double totalpoint = point + extrapoint;
		System.out.println("최종포인트는 " + totalpoint);
	}
}
