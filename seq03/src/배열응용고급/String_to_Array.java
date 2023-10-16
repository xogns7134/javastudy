package 배열응용고급;

import java.util.Arrays;

public class String_to_Array {
	public static void main(String[] args) {
		String s = "감자, 고구마, 양파";
		String[] s2 = s.split(",");
		System.out.println(Arrays.toString(s2));
		System.out.println(s2.length);
		System.out.println(s2[0]);
	}
}
