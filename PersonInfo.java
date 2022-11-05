package generics3;

public class PersonInfo {

	private String name;
	private String telNo;
	private int age;
	
	//생성자 작성
	public PersonInfo(String name, String telNo, int age) {
		
		this.name = name;
		this.telNo = telNo;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}
