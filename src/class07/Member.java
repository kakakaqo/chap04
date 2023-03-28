package class07;

public class Member {
	
	// 필드
	private String name; // 이름
	private String joinDate; // 가입일
	private String lastVisitDate; // 최종방문일
	private int numVisit; // 방문횟수
	private char gender; // 성별
	private String age; // 연령대
	
	// 기본 생성자
	public  Member() {
		
	}
	
	// 오버로딩 생성자
	public  Member(String name, String joinDate, String lastVisitDate,
			int numVisit, char gender, String age) {
		this.name = name;
		this.joinDate = joinDate;
		this.lastVisitDate = lastVisitDate;
		this.numVisit = numVisit;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(String lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}

	public int getNumVisit() {
		return numVisit;
	}

	public void setNumVisit(int numVisit) {
		this.numVisit = numVisit;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}