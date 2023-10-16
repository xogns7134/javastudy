package 배열기본;

public class Array_basic3 {
	public static void main(String[] args) {
		// int, char, String, JButton, double, boolean
		int[] age = { 200, 100, 50, 10 };
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.print("\n");
		for (int x : age) {
			System.out.print(x + " ");
		}
		System.out.print("\n");

		double[] weight = { 99.9, 88.8, 77.7, 66.6 };
		for (int i = 0; i < weight.length; i++) {
			System.out.print(weight[i] + " ");
		}
		System.out.print("\n");
		for (double d : weight) {
			System.out.print(d + " ");
		}

		String[] name = { "장태훈", "양민주", "최영태" };
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		char[] gender = { '남', '여' };
		for (char g : gender) {
			System.out.print(g + " ");
		}
		boolean[] food = { true, false };
	}
}
