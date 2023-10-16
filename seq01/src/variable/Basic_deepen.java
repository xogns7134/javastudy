package variable;

public class Basic_deepen {
	public static void main(String[] args) {
		byte age = 127;	//1byte
		short wallet = 25000; //2byte
		int money = 2000000000; //4byte
		long space = 2100000000; //8byte
		int age2 = age; //큰방(4byte) <-- 작은방(1byte) : 자동으로 알아서 들어감
		byte age3 = (byte)age2; //작은방(1byte) <-- 큰방(4byte) : 강제 변환 필요
		
		
	}
}
