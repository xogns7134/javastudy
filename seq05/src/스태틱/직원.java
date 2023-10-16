package 스태틱;

public class 직원 {
	public String name;
	public String gender;
	public int age;
	public static int count;
	public static int totalage;

	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		totalage = totalage + age;
	}
	public static int getAvg() {
		return totalage/count;
	}
	
	public String toString() {
		return "직원 [이름 : "+name+", 나이 : "+age+", 성별 : "+gender+"]";
	}
}
