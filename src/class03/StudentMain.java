package class03;

public class StudentMain {

	public static void main(String[] args) {

		Student[] students = new Student[8];

		// 학생 데이터를 생성해주는 메소드 호출
		initData(students);

		// 학생 목록 출력 메소드 호출
		printStudent(students);

		// 여학생들의 명단 호출
		printWomanStudent(students);

		// 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
		// 반환받은 이름을 main 메소드에서 출력하세요.
		String[] strName = getSeoulStudent(students); // 반환받은 문자열 배열 저장 변수 선언
		for (String str : strName) {
			System.out.println(str);
		}
		System.out.println();
		
		
	}

	// 서울에사는 3학년 학생들을 구하는 메소드
	private static String[] getSeoulStudent(Student[] students) {
		System.out.println("============ 서울 사는 3학년 이름 ============");
		String arrName = ""; // 서울 3학년생들의 이름을 이어붙일 String type 변수
		for (Student st : students) {
			if (st.getAddress().equals("서울") && st.getYear() == 3) { 
				arrName = arrName + st.getName() + (","); // 이름을 이어붙임 콤머로 구분해서
			}
		}
		String[] resultName = arrName.split(",");
		return resultName;

	}

	// 여학생들의 명단을구하는 메소드
	private static void printWomanStudent(Student[] students) {
		System.out.println("=============== 여학생 명단 ===============");
		for (Student st : students) {
			String sp = st.getJumin().substring(7, 8);
			if (sp.equals("2")) {
				System.out.println(st.getId() + " " + st.getJumin() + " " + st.getName() + " " + st.getYear() + " "
						+ st.getAddress() + " " + st.getDepartment());
			}
		}
		System.out.println();
	}

	// 학생 목록을 출력하는 메소드
	private static void printStudent(Student[] students) {

		for (Student st : students) {
			System.out.println(st.getId() + " " + st.getJumin() + " " + st.getName() + " " + st.getYear() + " "
					+ st.getAddress() + " " + st.getDepartment());
			
		}
		System.out.printf("========================================\n");
		System.out.println();
	}

	// 학생 데이터 생성 메소드
	private static void initData(Student[] student) {

		System.out.printf("========================================\n");
	      System.out.printf("학번           주민번호                   이름 학년 주소 학과코드  \n");

		// 학생 데이터 생성
		student[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		student[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		student[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		student[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		student[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		student[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		student[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		student[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);

	}

}