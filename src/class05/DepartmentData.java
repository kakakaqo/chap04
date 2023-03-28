package class05;

public class DepartmentData {
	
	// 필드
	public Department[] department = new Department[3];
	
	// 기본생성자
	public  DepartmentData() {
		department[0] = new Department(920, "컴퓨터공학과", "201호");
		department[1] = new Department(923, "산업공학과", "207호");
		department[2] = new Department(925, "전자공학과", "308호");
	}
}