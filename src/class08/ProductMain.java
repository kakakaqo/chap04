package class08;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData();
		Product[] products = pd.products;

		// [문제.1] 전체 상품 목록 출력
		printProduct(products);

		// [문제.2] 세탁기의 가격을 조회하시오.
		String tempStr = "세탁기";
		getWashPrice(tempStr, products);
		System.out.println();

		// [문제.3] 구매한 모든 제품의 총액과 평균 가격을 main메소드에서 출력하세요.
		int sum = getTotalAmount(products);
		System.out.println();
		double avg = avg(products);
		System.out.printf("구매한 모든 제품의 총액은 : %d원이며 평균 구매 가격은 %.2f 원입니다.", sum, avg);
		System.out.println();

		// [문제.4] 제품 중에서 100만원이 넘는 제품의 목록, 수량 출력
		getProductGrather100(products);
	}

	private static void getProductGrather100(Product[] products) {
		int count = 0;
		int sum = 0;
		System.out.println("가격이 100만원 이상인 제품은 다음과 같습니다.");
		for (int i = 0; i < products.length; i++) {
			if (products[i].getPrice() >= 1000000) {
				count++; // 100만원 넘는 그매 제품 합산 계수
				sum = sum + products[i].getPrice(); // 100만원이 넘는 구매 제품의 금액 합산
				System.out.println("------------------------------------------------");
				System.out.println(products[i].getId() + "\t" + products[i].getName() + "\t" + products[i].getPrice());
			}
		}
		System.out.printf("100만원인 이상인 제품의 수량은 %d개 이며 합계금액은 : %d입니다.", count, sum);

	}

	// 평균을 구해주는 메소드
	private static double avg(Product[] products) {
		double avg = 0.0;
		int count = 0;
		int sum = 0;
		for (Product pr : products) {
			count++;
			sum = sum + pr.getPrice();
		}
		avg = (sum * 1.0) / count;
		return avg;
	}

	// 구매한 모든 제품의 총액을 구해주는 메소드
	private static int getTotalAmount(Product[] products) {
		int sum = 0;
		for (Product pr : products) {
			sum = sum + pr.getPrice();
		}
		return sum;
	}

	// 세탁기의 가격을 구해주는 메소드(제품명을 파라미터로 받고 있음)
	private static int getWashPrice(String tempStr, Product[] products) {
		int Str = 0;
		for (Product pr : products) {
			if (pr.getName().equals(tempStr)) {
				Str = Str + pr.getPrice();
				System.out.printf("%s의 가격은 : %d원", tempStr, Str);
			}
		}
		return Str;
	}

	// 전체 상품 메소드
	private static void printProduct(Product[] products) {
		for (Product pr : products) {
			System.out.println(pr.getId() + "\t" + pr.getName() + "\t" + pr.getPrice());
		}
		System.out.println();
	}

}