package 배열응용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import 배열기본.Print;

public class 정리문제2 {
	public static void main(String[] args) {
		// 1. String 정리 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("전화 번호 입력 : ");
		String number = sc.next();
		number = number.trim();
		String[] number1 = number.split("-");
		String tel = "";
		String phone = "";
		String correct = "";
		if (number1[0].equals("011")) {
			tel = "SK";
		} else if (number1[0].equals("019")) {
			tel = "LG";
		} else {
			tel = "Apple";
		}

		if (number1[1].length() >= 4) {
			phone = "최신폰";
		} else {
			phone = "올드폰";
		}

		if (number1[0].length() + number1[1].length() + number1[2].length() >= 10) {
			correct = "유효한 전화번호";
		} else {
			correct = "유효하지 않은 전화번호";
		}
		System.out.println("통신사는 " + tel + ", 종류는 " + phone + ", 번호는 " + correct + "이다.");

		// 2. 배열 찾기 정리 문제
		int[] n = new int[10];
		System.out.print("숫자 10개 입력 : ");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		Print.arr(n);
		System.out.println("==============");
		int min = n[0];
		int max = n[0];
		ArrayList<Integer> minindex = new ArrayList<Integer>();
		ArrayList<Integer> maxindex = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
				minindex.clear();
				minindex.add(i);
			} else if (n[i] == min) {
				minindex.add(i);
			}
			if (n[i] > max) {
				max = n[i];
				maxindex.clear();
				maxindex.add(i);
			} else if (n[i] == max) {
				maxindex.add(i);
			}
		}
		System.out.println("최소값은 " + min);
		System.out.println("최소값의 위치는 " + minindex);
		System.out.println("최대값은 " + max);
		System.out.println("최대값의 위치는 " + maxindex);
	} // main
} // class
