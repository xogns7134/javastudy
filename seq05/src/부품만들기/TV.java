package 부품만들기;

public class TV {
	//TV라는 부류의 공통적인 특징을 가지고 틀을 만든다
	//속성(특성, 성질) -> 채널, 볼륨, 온오프상태 ==> 멤버변수로 표현
	//기능(동작) -> 채널을 바꾸다, 유튜브보다 ==> 멤버메서드로 표현
	
	public int ch; // public --> 다른 package에서도 쓸 수 있게 만든다
	public int vol;
	public boolean onOff;
	// TV tv1 = new TV(); --> 하는 순간 변수 4개 만들어짐
	// 주소는 4, int는 4, boolean 1 ==> 13 바이트
	
	public void changech() {
		System.out.println("채널 바꾸는 기능 처리");
	}
	public void seeyoutube() {
		System.out.println("유튜브 보는 기능 처리");
	}
}
