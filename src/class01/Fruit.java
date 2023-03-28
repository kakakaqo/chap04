/**
 * 과일 클래스   클래스 역할 - 객체생성, 설계도
 * 필드(멤버변수, 인스턴스변수)
 * - String name
 * - int price
 * - int quantity
 * 생성자 - 초기화 하기위해 
 * getter/setter - private를 이용해 사용할때 사용
 */

package class01;

public class Fruit {

	private String name;
	private int price;
	private int quantity;

	// 기본 생성자
	public Fruit() {

	}

	// 오버로딩 생성자
	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void showFruitInfo() {
		System.out.println(this.name + this.price + this.quantity);
	}
}