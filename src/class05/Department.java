package class05;

public class Department {

/**
 * 학과 클래스
 * 920, "컴퓨터공학과", "201호"
 * 923, "산업공학과", "207호"
 * 925, "전자공학과", "308호"
 */
	
	// 필드
	private int id; // 학과 코드
	private String name; // 학고명
	private String office; // 교실

	// 기본 생성자
	public Department() {

	}

	// 오버로딩 생성자
	public Department(int id, String name, String office) {
		this.id = id;
		this.name = name;
		this.office = office;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

}