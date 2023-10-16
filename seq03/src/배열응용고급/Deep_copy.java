package 배열응용고급;

import java.util.Arrays;

public class Deep_copy {
	public static void main(String[] args) {
		String[] subject = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		// int [] term2 = term1; 얕은 복사, 배열이 가리키는 주소를 복사해옴
		// term1 값이 바뀌면 term2 값도 바뀜
		int[] term2 = term1.clone(); // 깊은 복사, 주소가 가리키는 값을 복사해옴
		// term1 값이 바뀌어도 term2 값은 바뀌지 않음
		int same = 0;
		int up = 0;
		int down = 0;
		String[] subject1 = new String[subject.length];
		term2[0] = 22;
		term2[2] = 88;
		System.out.println("1학기 성적 : " + Arrays.toString(term1));
		System.out.println("2학기 성적 : " + Arrays.toString(term2));
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				same++;
			} else if (term1[i] < term2[i]) {
				up++;
				subject1[up - 1] = subject[i]; // subject1 배열에 과목명 저장
			} else {
				down++;
			}
		}
		// 출력부분에서 null 없애기
		int trimmed = 0;
		String[] trimmedsubject1 = new String[up];
		for (String x : subject1) {
			if (x != null) {
				trimmedsubject1[trimmed] = x;
				trimmed++;
			}
		}
		
		System.out.println("1학기, 2학기 성적이 동일한 과목 수는 " + same + "과목");
		System.out.println("2학기에 성적이 오른 과목 수는 " + up + "과목");
		System.out.println("성적이 오른 과목 명은 " + Arrays.toString(trimmedsubject1));
	}
}
