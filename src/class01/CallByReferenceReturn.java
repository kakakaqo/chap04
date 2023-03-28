/**
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 * - 콜바이 레퍼런스(Call by reference) : 참조 주소값 복사
 * 배열값은 한번에 보내지 못하고 주소를 보낼수있다. 
 */

package class01;

public class CallByReferenceReturn {

	public static void main(String[] args) {


		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] newNumbers = addTen(numbers); // 메소드 호출하고 반환된 값을 받음
		//// 전달받은 배열의 요소에 10을 더해주는 메소드
		//addTen(numbers); // 메소드 호출하고 반환된 값을 받음

//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}

		 for(int i = 0; i < newNumbers.length; i++) {
		 System.out.print(newNumbers[i] + " ");
		 }
	}

	private static int[] addTen(int[] arr) { // arr(파라미터) 이름은 달라도 상관없다

		// 새로운 배열
		int[] arrNums = null ; // 배열 변수 선언 메모리 공간 확보 x
		arrNums = new int [arr.length]; // 5칸짜리 새로운 배열이 만들어짐.
		arrNums[0] = arr[0] + 10;
		arrNums[1] = arr[1] + 10;
		arrNums[2] = arr[2] + 10;
		arrNums[3] = arr[3] + 10;
		arrNums[4] = arr[4] + 10;

		for(int i = 0; i < arr.length; i++) {
			arr[i] += 10;
		}
		return arrNums; // 값 반환
		
/*		// 기존 배열 
		arr[0] = arr[0] + 10;
		arr[1] = arr[1] + 10;
		arr[2] = arr[2] + 10;
		arr[3] = arr[3] + 10;
		arr[4] = arr[4] + 10;
		System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);

		// 일반 for문
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 10;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 향상된 for문
		for (int i : arr) {
			System.out.print(i + 10 + " ");
		}
*/		
	}
}