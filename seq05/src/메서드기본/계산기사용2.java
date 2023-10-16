package 메서드기본;

public class 계산기사용2 {
	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전 손님
		int count2 = 4; // 오후 손님
		// 1. 전체 손님 수
		int count3 = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + count3 + "명 입니다.");

		// 2. 오전과 오후 손님 수 차이
		int count4 = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + count4 + "명 입니다.");

		// 3. 오전에 들어온 손님의 결제 금액
		int am = cal3.amprice(price, count1);
		System.out.println("오전 결제 금액은 " + am + "원 입니다.");

		// 4. 오후에 들어온 손님의 결제 금액
		int pm = cal3.amprice(price, count2);
		System.out.println("오후 결제 금액은 " + pm + "원 입니다.");
		// 5. 총 결제 금액
		int total = cal3.totalprice(price, count1, count2);
		System.out.println("오늘 하루 총 결제 금액은 " + total + "원 입니다.");

		// 6. 5번에서 계산한 결제금액으로 1인당 결제금액 계산
		int perprice = cal3.div(price, count1, count2);
		System.out.println("1인당 결제 금액은 " + perprice + "원 입니다.");
	}
}
