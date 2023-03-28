/**
 * 학사 행정 실행 클래스
 * - 특징으로는 두 개의 객체를 조인해서 결과를 뽑아낸다 .(학생정보 + 학과정보)
 */

package class10;

import class10.vo.Student;
import class10.vo.Takes;
import class10.vo.Department;
import class10.vo.MakeData;
import class10.vo.Professor;

public class SchoolManagementMain {

	public static void main(String[] args) {
		
		// 데이터 생성
		MakeData makeData = new MakeData();
		Student[] students = makeData.students;
		Takes[] takes = makeData.takes;
		Department[] department = makeData.department;
		Professor[] professors = makeData.professors;
		
		
		
		// [문제.1] 전체 학생 명단을 출력하시오.
		//printStudent(students, department, takes);
		
	//	printsb(students, takes);
		
		//[문제.3] 컴퓨터공학과 교수들을 모두 조회하세요.
		// 1. 학과배열에서 컴퓨터공학과 코드를 찾기
		// 2. 코드로 교수 배열에 해당하는 교수 찾기
		String searcgDept = "컴퓨터공학과";
		int dId = 0; // 컴퓨터공학과의 id 저장용 변수
		for(int i = 0; i < department.length; i++) {
			if( department[i].getName().equalsIgnoreCase(searcgDept)) {
				dId  = department[i].getId(); // 컴퓨터 공학과의 id 추출
			}
		}
		for(int i = 0; i < professors.length; i++) {
			if( dId == professors[i].getDepartment() ) {
				System.out.println(professors[i].getId() + "\t" + professors[i].getJumin() + "\t" + professors[i].getName() + 
						"\t" + professors[i].getDepartment() + "\t" + professors[i].getGrade() + 
						"\t" + professors[i].getHiredate() + "\t" + searcgDept);
			}
		}
		
	}
/*
	private static void printsb(Student[] students, Takes[] takes) {
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < takes.length; j++) {
				if( students[i].getId().equals(takes[j].getId())){
					System.out.println(students[i].getId() + "\t" + students[i].getJumin() + "\t"
							+ students[i].getName() + "\t" + students[i].getYear() + 
							"\t" + students[i].getAddress()+ "\t" + students[i].getDepartment() + 
							"\t" + takes[j].getSubject() + "\t" + takes[j].getScore());
				}
			}
		}
		System.out.println();
	}
*/	
	
/*
	// 학생 데이터 출력하는 메소드
		private static void printStudent(Student[] students, Department[] department) {
			for (int i = 0; i < students.length; i++) {
				for (int y = 0; y < department.length; y++) {
					if (students[i].getDepartment() == department[y].getId()) {
						System.out.println(students[i].getId() + "\t" + students[i].getJumin() + "\t"
								+ students[i].getName() + "\t" + students[i].getYear() + 
								"\t" + students[i].getAddress()+ "\t" + students[i].getDepartment() + 
								"\t" + department[y].getName());
					}
				}
			}
		}
*/
}