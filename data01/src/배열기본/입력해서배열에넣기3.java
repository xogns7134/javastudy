package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 입력해서배열에넣기3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자 입력 : ");
			numbers[i] = sc.nextDouble();
		}
		sc.close(); // 통로 닫기
		System.out.println(Arrays.toString(numbers));
		int count = 0;
		String index = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("index of 22.2 : " + i);
			} else if (numbers[i] == 33.3) {
				System.out.println("index of 33.3 : " + i);
				count++;
				index = index + i + " ";
				list.add(i);
			}
		}
		System.out.println(count);
		System.out.println("index of 33.3 : " + index);
		System.out.println(list);
		// List<double[]> list = Arrays.asList(numbers); // array를 list로 바꿔라
		
		for (int i = 0; i < list.size(); i++) {
			int index1 = list.get(i);
			numbers[index1] = 333.3;
		}
		System.out.println(Arrays.toString(numbers));
	} // main
} // class
