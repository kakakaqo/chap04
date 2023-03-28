/**
 * 실행클래스
 */

package class01;

public class FruitMain {

	public static void main(String[] args) {

		// 객체 한개 생성
		Fruit peach = new Fruit();  // new Fruit 에서 new = 객체생성  Fruit = 필드초기화
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);
		
		printFruit(peach); // 메소드 생성
		
		// 과일 객체 5개 생성
		// "사과", 2000, 5 apple
		Fruit apple = new  Fruit("사과", 2000, 5);
		// "망고", 1000, 2 mango
		Fruit mango = new  Fruit("망고", 1000, 2);
		// "바나나", 2500,3 banana
		Fruit banana = new  Fruit("바나나", 2500, 3);
		// "파인애플", 5000, 1 pineapple
		Fruit pineapple = new  Fruit("파인애플", 5000, 1);
		// "오렌지", 6000, 4 orange
		Fruit orange = new  Fruit("오렌지", 6000, 4);
		
		// 과일 객체 5개 전달해서 받아서 출력하는 메소드 만드세요.
		printFruit(apple, mango, banana, pineapple, orange);
		
		// 과일 객체 5개 담을 수 있는 Array선언
		Fruit fruit[] = new Fruit[5];
		// 선언한 배열에 위에서 만든 과일객체 담으세요.
		fruit[0] = new Fruit("사과", 2000, 5);
		fruit[1] = new Fruit("망고", 1000, 2);
		fruit[2] = new Fruit("바나나", 2500, 3);
		fruit[3] = new Fruit("파인애플", 5000, 1);
		fruit[4] = new Fruit("오렌지", 6000, 4);
		
		printFruit(fruit);
	}

	private static void printFruit(Fruit peach) {
		System.out.println(peach.getName() + " " + peach.getPrice() + " " + peach.getQuantity());
	}
	
	private static void printFruit(Fruit apple,Fruit mango,Fruit banana,Fruit pineapple,Fruit orange) {
		System.out.println(apple.getName() + " " + apple.getPrice() + " " + apple.getQuantity());
		System.out.println(mango.getName() + " " + mango.getPrice() + " " + mango.getQuantity());
		System.out.println(banana.getName() + " " + banana.getPrice() + " " + banana.getQuantity());
		System.out.println(pineapple.getName() + " " + pineapple.getPrice() + " " + pineapple.getQuantity());
		System.out.println(orange.getName() + " " + orange.getPrice() + " " + orange.getQuantity());
	}
	
	// 일반 for문
	private static void printFruit(Fruit[] fruit) {
		for(int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i].getName() + " " + fruit[i].getPrice() + " " + fruit[i].getQuantity());
		}
		
	// 향상된 for문
		for (Fruit i : fruit) {
			System.out.println( i.getName() + " " + i.getPrice() + " " + i.getQuantity() );
		}
	}
}