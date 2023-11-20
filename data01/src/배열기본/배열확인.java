package 배열기본;

import java.util.Arrays;

public class 배열확인 {
	public static void main(String[] args) {
		// 배열은 많은 양의 데이터를 다루기 위한 자료구조
		// 배열을 만드는 방법
		//	1) 배열을 만들 때 이미 값들을 알고 있는 경우
		// 선형으로 값들을 집어 넣음
		int[] ages = {60, 50, 30, 20, 10};
		// 생기는 변수의 개수는 총 7개
		System.out.println(Arrays.toString(ages));
		System.out.println(ages.length);
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		//	2) 배열을 만들 때 아직 값들을 모르고 있는 경우
		// 저장공간을 먼저 만들고 나중에 값들을 집어 넣음
		double[] weight = new double[5]; // {0, 0, 0, 0, 0} -- 자동 초기화
		weight[0] = 88.8;
		weight[1] = 88.7;
		weight[2] = 88.6;
		weight[3] = 88.5;
		weight[4] = 88.4;
	}
}
