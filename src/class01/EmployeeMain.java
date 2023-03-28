package class01; // package name

public class EmployeeMain { // class start

	public static void main(String[] args) { // main start

		// Employee type Array 선언(10칸짜리)
		Employee[] emps = new Employee[10];

		// Raw Data로 각 배열에 객체를 생성해서 저장
		emps[0] = new Employee("A", 28, 400, "KR", 10, "정규");
		emps[1] = new Employee("B", 27, 600, "KR", 15, "정규");
		emps[2] = new Employee("C", 26, 280, "JP", 1, "비정규");
		emps[3] = new Employee("D", 25, 360, "JP", 2, "비정규");
		emps[4] = new Employee("E", 23, 270, "RU", 1, "정규");
		emps[5] = new Employee("F", 27, 390, "AM", 4, "정규");
		emps[6] = new Employee("G", 31, 330, "SI", 3, "정규");
		emps[7] = new Employee("H", 35, 280, "CA", 2, "비정규");
		emps[8] = new Employee("I", 38, 450, "FR", 10, "정규");
		emps[9] = new Employee("J", 45, 600, "JP", 15, "정규");

		// 1. 배열을 받아서 전사원 목록을 출력해주는 메소드 생성
		System.out.println("1. 전 사원들의 목록");
		System.out.println("[사원 raw Data]");
		System.out.println("=============================================");
		System.out.println("이름\t나이\t급여\t지역\t근무연수\t사원구분");
		System.out.println("name\tage\tsalary\tlocal\tterms\tgubun");
		printEmployee(emps);
		System.out.println("=============================================");
		
		// 2. 정규직 평균급여를 구해주는 메소드 생성(결과 반환)
		// 출력 결과 : 2. 정규직 직원들의 평균 급여는 : 434.29
		
		//printgetSalAvg(emps);
		double avg = gatSalAvg(emps);
		System.out.println("2. 정규직 직원들의 평균 급여는 : " + Math.round(avg*100) / 100.0);
		System.out.println();
		
		// Math.round = 소수점 첫째에서 반올림    ex) 3.1314  = 3 , 
		
		// 3. 한국(KR) 사원들의 평균 급여 500.0
		
		double avg1 = gatSalavg(emps);
		System.out.println("3. 한국 직원들의 평균 급여는 : " + Math.round(avg1*100) / 100.0);
		
	} // main end
	
	private static double gatSalavg(Employee[] emps) {
	int score = 0;
	int people = 0;
	double salAvg = 0.0;
	for (Employee employee : emps) {
		if(employee.getLocal().equals("KR")) {
			people ++;
			score += employee.getSalary();
		}
	}
	
	salAvg = (double) score / people;
	return salAvg;
}

	private static double gatSalAvg(Employee[] emps) {
		int score = 0; // 점수 변수
		int people = 0; // 인원수 변수
		double salAvg = 0.0; // 평균 변수
		
		for (Employee employee : emps) {
			if(employee.getGubun().equals("정규")) {
				people ++;
				score = score + employee.getSalary();
			}
		}
		
		salAvg = (double) score / people;
		return salAvg;
	}


	// 배열을 받아서 전사원 목록을 출력해주는 메소드 생성
	private static void printEmployee(Employee[] emps) { 
		for (Employee employee : emps) {
			System.out.println(employee.getName() + "\t" + employee.getAge() + "\t" + employee.getSalary() + "\t"
					+ employee.getLocal() + "\t" + employee.getTerms() + "\t" + employee.getGubun());
		}
	} 

/*	
	private static void printgetSalAvg(Employee[] emps) {
		int score = 0; // 점수 변수
		int people = 0; // 인원수 변수
		double avg = 0.0; // 평균 변수
*/
		
		// 일반 for 문
/*	
		for(int i = 0; i < emps.length; i++  ) {
			if( emps[i].getGubun().equals("정규") ) {
				people ++;
				score = score + emps[i].getSalary();
			}
		}
		
		// 향상된 for문
		for (Employee employee : emps) {
			if(employee.getGubun().equals("정규")) {
				people ++;
				score = score + employee.getSalary();
			}
		}
		
		System.out.printf("정규직 직원들의 급여 총 합은 : %d만원", score);
		System.out.println();
		avg = (double) score / people;
		System.out.printf("2. 정규직 직원들의 평균 급여는 : %.2f만원", avg);
	}
*/	
}// class end