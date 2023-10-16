package 배열문제;

public class Exam_array_basic {
	public static void main(String[] args) {
		// 1. int 크기 5인 배열 생성
		int[] a = new int[5];

		// 2. 배열 크기 프린트
		System.out.println("배열의 크기 : " + a.length);

		// 3. 배열의 첫 번째 위치에 100 넣고 프린트
		a[0] = 100;
		System.out.println("배열의 첫 번째 숫자 : " + a[0]);

		// 4. 배열의 마지막 위치에 500 넣고 프린트
		a[a.length - 1] = 500;
		System.out.println("배열의 마지막 숫자 : " + a[a.length - 1]);
		
		//5. 배열의 세 번째 위치에 200 넣고 프린트
		a[2] = 200;
		System.out.println("배열의 세 번째 숫자 : "+a[2]);
		
		//6. 배열의 전체 데이터 프린트
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");			
		}
		System.out.println();
		//7. 배열의 전체 데이터를 인덱스와 함께 프린트
		for (int i = 0; i < a.length; i++) {
			System.out.print("["+(i+1)+". "+a[i]+"] ");			
		}	
	}
}
