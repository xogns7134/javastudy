package 생성자;

public class 컴퓨터 {
	//멤버 변수
	int cost;	// 가격
	String company; //제조 회사
	int size; //모니터 크기
	
	//멤버 변수 값 초기화 역할
	public 컴퓨터(int cost, String company, int size) {
		this.cost = cost;
		this.company = company;
		this.size = size;
	}
	public String toString() {
		return "컴퓨터 [가격=" + cost + ", 제조회사="+company+", 모니터 크키="+size+"]";
	}
	
	}
