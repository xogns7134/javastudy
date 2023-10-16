package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class Array_application7 {
	public static void main(String[] args) {
		int[] correct = new int[990];
		int[] answer = new int[990];
		int point = 0;
		Random r = new Random();
		for (int i = 0; i < correct.length; i++) {
			correct[i] = r.nextInt(4);
			answer[i] = r.nextInt(4);
			if (correct[i] == answer[i]) {
				point++;
			}
		}
		System.out.println(Arrays.toString(correct));
		System.out.println(Arrays.toString(answer));
		System.out.println("점수 : "+point+"점");
	}
}
