package control.conditional;

import javax.swing.JOptionPane;

public class Exam_conditional {
	public static void main(String[] args) {

		// Exam1
		String a = JOptionPane.showInputDialog("첫 번째 숫자를 입력하세요.(정수)");
		String b = JOptionPane.showInputDialog("두 번째 숫자를 입력하세요.(정수)");
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int sum = a1 + b1;
		int minus = a1 - b1;
		int multi = a1 * b1;
		double div = (double) a1 / (double) b1;
		System.out.println("두 수의 합은 " + sum);
		System.out.println("두 수의 차는 " + minus);
		System.out.println("두 수의 곱은 " + multi);
		System.out.println("두 수를 나눈 값은 " + div);
		
		// Exam2
		String temp = JOptionPane.showInputDialog("현재 온도");
		double temp1 = Double.parseDouble(temp);
		if (temp1 >= 25) {
			System.out.println("너무 더워요");
		}
		else {
			System.out.println("괜찮아요.");
		}
	}
}
