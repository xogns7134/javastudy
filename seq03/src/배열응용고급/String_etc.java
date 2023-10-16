package 배열응용고급;

public class String_etc {
	public static void main(String[] args) {
		String s = "내 이름은 장태훈이다";
		String s2 = "장태훈";
		System.out.println((s + s2)); //스트링 결합
		System.out.println(s.concat(s2)); //스트링 결합
		System.out.println(s.charAt(0)); // 첫 글자 추출
		System.out.println(s.endsWith("다")); //특정한 문자로 끝나는지 확인
		System.out.println(s.substring(3)); //인덱스 3 부터 글자들 모두 추출
		System.out.println(s.substring(3, 8)); //인덱스 3~7까지 추출
		System.out.println(s.contains(s2)); // s에 s2가 포함되어 있는지
		System.out.println(s.lastIndexOf("장")); //s에서 '장'글자의 위치
		System.out.println(s.toUpperCase()); // 대문자로
		System.out.println(s.toLowerCase()); // 소문자로
		System.out.println(s.length()); // 글자 수
		System.out.println(s.replace("다", "군")); // 앞글자를 뒷글자로 대체
		System.out.println(s.trim()); // s의 좌우 공백 제거
	}
}
