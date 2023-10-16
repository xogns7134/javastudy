package 상속;

public class 수퍼맨사용 {
	public static void main(String[] args) {
		수퍼맨 s = new 수퍼맨();
		s.age = 1000;
		s.speed = 1;
		s.power = 100;
		
		s.걷다();
		s.먹다();
		s.자다();
		s.우주를날다();
		s.run();
	}
}
