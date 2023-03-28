package class02;

public class ProfessorMain { // class start

	public static void main(String[] args) { // main end

		Professor[] professor = new Professor[6];

		// 교수 객체 저장용 객체 배열 생성
		professor[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		professor[1] = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		professor[2] = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		professor[3] = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		professor[4] = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		professor[5] = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");

		// 교수들의 목록을 출력해주는 메소드를 만드세요.
		System.out.println("[Professor raw Data]");
		System.out.println("교수ID\t주민번호\t\t성명\t학과\tgrade\t입사일자");
		// 교수 목록 출력하는 메소드 호출
		printProfessor(professor);
		System.out.println();

		// 910 학과 교수증 입사년도가 2005년인 교수는?(2조건)
		// 910 학과 교수중 입사년도가 2005년인 교수를 찾아주는 메소드 호출
		getHireDate2005(professor);
		System.out.println();

		// 주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
		// 새로 입사한 선명규 교수를 그 자리에 저장하세요.
		// (빈객체 생성후 setter 메소드로 값저장)
		// "96031", "790208-1884203", "선명규", 920, "부교수", "2021"
		newProfessor(professor); // 이태규 -> 선명규 교수로 바꿔주는 메소드 호출

	} // main end

	// 교수들의 목록을 출력해주는 메소드
	private static void printProfessor(Professor[] professor) {
		for (Professor professor1 : professor) {
			System.out.println(professor1.getId() + "\t" + professor1.getJumin() + "\t" + professor1.getName() + "\t"
					+ professor1.getDepartment() + "\t" + professor1.getGrade() + "\t" + professor1.getHiredate());
		}

	}

	   // 910 학과 교수중 입사년도가 2005년인 교수 구하는 메소드
	   private static void getHireDate2005(Professor[] professor) {
	      for (Professor professor1 : professor) {
	         if (professor1.getDepartment() == 910 && professor1.getHiredate().contains("2005")) {
	            System.out.printf("%s  %s  %s  %d  %s  %s \n", professor1.getId(), professor1.getJumin(),
	                  professor1.getName(), professor1.getDepartment(), professor1.getGrade(), professor1.getHiredate());
	         }
	      }
	   }

	private static void newProfessor(Professor[] professor) {
		// 전체 배열에서 이태규 교수 찾기
		for (int i = 0; i < professor.length; i++) {
			// 이태규 교수 객체이면
			if ((professor[i].getJumin().equals("590327-1839240")) && (professor[i].getName().equals("이태규"))) {
				// 새로운 교수 객체 생성
//				Professor sun = new Professor();
//				sun.setId("96031");
//				sun.setJumin("790208-1884203");
//				sun.setName("선명규");
//				sun.setDepartment(920);
//				sun.setGrade("부교수");
//				sun.setHiredate("2021");
				// 기존 이태규 교수 자리에 새로운 선명규 교수 객체 저장

				Professor sun = new Professor("96031", "790208-1884203", "선명규", 920, "부교수", "2021");
				professor[i] = sun;
			}
		}
		// 바뀐 교수 명단 출력
		printProfessor(professor);
	}

} // class end