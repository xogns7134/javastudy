package 배열문제;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_array_application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int same = 0;
		int diff = 0;
		String where[] = new String[3];
		String[] lastyear = new String[3];
		System.out.println("작년에 가고 싶었던 곳 : ");
		for (int i = 0; i < lastyear.length; i++) {
			lastyear[i] = sc.next();
		}
		String[] thisyear = new String[3];
		System.out.println("올 해에 가고 싶었던 곳 : ");
		for (int i = 0; i < thisyear.length; i++) {
			thisyear[i] = sc.next();
		}
		for (int i = 0; i < thisyear.length; i++) {
			if (lastyear[i].equals(thisyear[i])) {
				same++;
				where[i] = lastyear[i];
			} else {
				diff++;
			}
		}
		System.out.println("작년과 올 해에 가고 싶은 장소가 동일한 것은 " + same + "개");
		System.out.println("작년과 올 해에 가고 싶은 장소가 달라진 것은 " + diff + "개");

		if (same > 0) {
			System.out.println("작년에도 올 해에도 가고 싶은 곳은 " +
					Arrays.toString(Arrays.copyOf(where, same)));
		} else {
			System.out.println("작년과 올 해 둘 다 가고 싶은 곳은 없습니다.");
		}
	}
}
