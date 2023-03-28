package class05;

public class DepartmentMain {

	public static void main(String[] args) {

		// DepartmentData 객체 생성
		DepartmentData dd = new DepartmentData(); // DepartmentData 객체의 주소가 dd로 들어감
		Department[] department = dd.department; // DepartmentData 객체의 필드를 갖고옴

		// Department type의 배열 변수 
		// Department[] departments = new Department[3];
		// 기초데이터 생성
		// initData(department);

		// 학과 목록 출력 메소드 호출
		printDepartment(department);

		// 학과코드(id)가 "923"인 학과의 코드(id),name,office를 출력하시오
		// 학과코드(id)가 "923"인 학과의 코드(id),name,office 메소드 호출
		getDepartment(department);
		System.out.println();

		// 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요.
		String st  = getOffice(department);
		System.out.println("컴퓨터 공학과 교실은 : " + st);
	}

	// 컴퓨터공학과의 교실을 조회하는 메소드
	private static String getOffice(Department[] department) {
		String arrClass = "";
		for(int i = 0; i < department.length; i++) {
			if( department[i].getName().equals("컴퓨터공학과")) {
				arrClass = arrClass + department[i].getOffice();
			}
		}
		return arrClass;
	}

	// 학과 코드로 학과명 조회
	private static void getDepartment(Department[] department  ) {
		for (Department de : department) {
			if( de.getId() == 923 ) {
				System.out.printf("%d %s %s " , de.getId() , de.getName() , de.getOffice());
			}
		}
		System.out.println();
	}

	// 학과 데이터 목록 출력 메소드
	private static void printDepartment(Department[] department) {
		for (Department de : department) {
			System.out.println(de.getId() + " " + de.getName() + " " + de.getOffice());
		}
		System.out.println();
	}

/*	
	// 학과데이터 생성해주는 메소드
	private static void initData(Department[] department) {
		department[0] = new Department(920, "컴퓨터공학과", "201호");
		department[1] = new Department(923, "산업공학과", "207호");
		department[2] = new Department(925, "전자공학과", "308호");
	}
*/
}