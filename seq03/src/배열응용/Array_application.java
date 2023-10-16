package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Array_application {
	public static void main(String[] args) {
		// 입력 5개 받아서 --> 저장 --> 꺼내서 누적연산
		int[] n2 = new int[3];
		for (int i = 0; i < n2.length; i++) {
			String n1 = JOptionPane.showInputDialog("숫자 입력");
			n2[i] = Integer.parseInt(n1);
		} // for-배열에 저장
//		String list = Arrays.toString(n2);
//		System.out.println(list); 이걸 한줄로 바꾸면
		System.out.println(Arrays.toString(n2)); // n2 값을 스트링으로 바꿔서 출력하기

		int sum = 0;
		for (int i : n2) {
			sum += i;
		}

//		for (int i = 0; i < n2.length; i++) {
//			sum += n2[i];
//		} 					위 2개 for문은 같은 함수
		double avg = (double) sum / n2.length;
		System.out.println("평균 점수는 " + avg);
	}
}
