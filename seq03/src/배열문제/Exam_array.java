package 배열문제;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exam_array {
	public static void main(String[] args) {
		// Exam 1
		int[] a = new int[200];
		a[0] = 1000;
		a[1] = 2000;
		a[2] = 3000;
		a[a.length - 1] = 5000;
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Exam 2
		double[] b = new double[300];
		b[0] = 10.1;
		b[1] = 20.2;
		b[2] = 30.2;
		b[b.length-1] = 50.5;
		for (double d : b) {
			System.out.print(d + " ");
		}
		System.out.println();

		// Exam 3
		String c[] = new String[5];
		for (int i = 0; i < c.length; i++) {
			String c0 = JOptionPane.showInputDialog("좋아하는 여행지 ");
			c[i] = c0;
		}
		System.out.println(Arrays.toString(c));

		char d[] = new char[5];
		for (int i = 0; i < d.length; i++) {
			String d0 = JOptionPane.showInputDialog("좋아하는 색깔의 첫 글자 ");
			char d00 = d0.charAt(0);
			d[i] = d00;
		}
		System.out.println(Arrays.toString(d));

		double e[] = new double[5];
		for (int i = 0; i < e.length; i++) {
			String e0 = JOptionPane.showInputDialog("좋아하는 연예인의 키");
			double e00 = Double.parseDouble(e0);
			e[i] = e00;
		}
		System.out.println(Arrays.toString(e));
	}
}
