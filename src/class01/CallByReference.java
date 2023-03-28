/**
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 * - 콜바이 레퍼런스(Call by reference) : 참조 주소값 복사
 * 이름이 같아도 메소드 오버로딩이 달라서 구분이 가능하다
 */

package class01;

public class CallByReference {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		
		// int 자료형 변수 1, 2, 3, 4, 5 저장
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		printArray(numbers); // 배열 출력 메소드 호출
		printArray(a, b, c, d, e); // 배열 출력 메소드 호출

	}

	// int a = 0; 파라미터 , 매개변수 
	private static void printArray(int a, int b, int c, int d, int e) { 
		System.out.println(a + " " + b + " " + c + " " + d + " " + e );
		
	}

	// 배열을 전달 받아서 출력해주는 메소드
	private static void printArray(int[] numbers) { // 배열에 주소가 전달받음
		
		// 일반 포문
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 향상된 포문
		for(int number : numbers ) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}