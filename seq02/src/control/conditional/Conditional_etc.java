package control.conditional;

public class Conditional_etc {
	public static void main(String[] args) {
		int jumsu = 88;
		String result = "";
		if (jumsu >= 90) {
			result = "A학점";
		}
		else if (jumsu >= 80 ) {
			result = "B학점";
		}
		else if (jumsu >= 70) {
			result = "C학점";
		}
		else if (jumsu >= 60) {
			result = "D학점";
		}
		else {
			result = "F학점";
		}
		System.out.println(result);
	}
}
