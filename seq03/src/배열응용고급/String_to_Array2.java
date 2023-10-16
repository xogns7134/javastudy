package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class String_to_Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String weather = sc.next();
		String[] weather2 = weather.split(",");
		System.out.println(Arrays.toString(weather2));
		int cloud = 0, sky = 0;
		for (String x : weather2) {
			if (x.equals("흐림")) {
				cloud++;
			} else {
				sky++;
			}
		}
		System.out.println(cloud + " " + sky);
	}
}
