package operator;

public class Exam_data_oper2 {
	public static void main(String[] args) {
		// Exam1
		int count = 5; // 커피 잔 수
		int cost = 5000; // 커피 가격
		int total = count * cost;
		if (total > 20000) {
			System.out.println("할인해드릴게요.");
		} else {
			System.out.println("총 커피값을 내세요.");
		}

		// Exam2
		int age1 = 100; // 현재 나이
		int age2 = age1 + 1; // 내년 나이
		if (age2 > 100) {
			System.out.println("이제부터 시작");
		} else {
			System.out.println("아직 젊어요");
		}

		// Exam3
		int costWater = 1000;
		int countWater = 2;
		int costMask = 2000;
		int countMask = 3;
		int totalWater = costWater * countWater;
		int totalMask = costMask * countMask;
		int totalcost = totalMask + totalWater;
		System.out.println("내가 지불해야 할 생수 값 금액은 " + totalWater + "원");
		System.out.println("내가 지불해야 할 마스크 값 금액은 " + totalMask + "원");
		System.out.println("내가 지불해야 할 총 금액은 " + totalcost + "원");

		// Exam4
		int language = 75; // 국어 점수
		int math = 50; // 수학 점수
		int sum1 = language + math; // 두 점수의 합
		double sum2 = (double) sum1;
		double avg = sum2 / 2; // 평균
		System.out.println("국어 점수와 수학 점수의 합은 " + sum1 + "점");
		System.out.println("국어 점수와 수학 점수의 평균은 " + avg + "점");

	}
}
