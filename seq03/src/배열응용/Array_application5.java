package 배열응용;

public class Array_application5 {
	public static void main(String[] args) {
		String[] family = { "아빠", "엄마", "누나", "나", "동생" };
		int[] age = { 52, 50, 30, 20, 10 };
		double[] height = { 177.7, 160.5, 163.2, 175.5, 143.3 };
		System.out.println("-------우리 가족-------");
		System.out.println("---------------------");
		System.out.println("이름\t나이\t키");
		for (int i = 0; i < height.length; i++) {
			System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);
		}
		System.out.println("우리 가족의 내년 나이");
		for (int i = 0; i < height.length; i++) {
			System.out.print(family[i]+"는 "+(age[i]+1)+"살 ");
		}
		height[height.length-1] = height[height.length-1] + 5;
	}
}
