package 배열응용;

public class Array_application6 {
	public static void main(String[] args) {
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int up = 0;
		int same = 0;
		int down = 0;
		for (int i = 0; i < 5; i++) {
			if (term1[i] < term2[i]) {
				up++;
			} else if (term1[i] == term2[i]) {
				same++;
			} else if (term1[i] > term2[i]) {
				down++;
			}
		}
		System.out.println("2학기에 성적이 올라간 학생은 " + up + "명");
		System.out.println("2학기에 성적이 유지된 학생은 " + same + "명");
		System.out.println("2학기에 성적이 내려간 학생은 " + down + "명");
	}
}
