/**
 * split(",") 메소드 : 콤머는 구분자
 * split 장점은 자동으로 잘라서 배열에 넣어줌 
 */

package class03;

public class SplitTestMain {

	public static void main(String[] args) {
		String csv = "홍길동;이규희;문소정;서규리;민중호";
		String[] arrTemp = csv.split(";"); // 문자열을 잘라서 배열 형태로 반환
		for (String st : arrTemp) {
			System.out.printf("%s ", st);
		}
	}
}