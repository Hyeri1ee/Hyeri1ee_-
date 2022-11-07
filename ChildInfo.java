package generics4;

public class ChildInfo {

	//멤버변수
	static int cnt;
	String name;
	int age;
	String telNo;
	//생성자
	public ChildInfo(String name, int age, String telNo) {
		
		this.name = name;
		this.age = age;
		this.telNo = telNo;
		cnt++;
	}
	//메소드
	static int getCnt() {
		return cnt;
	}
	@Override
	public String toString() {
		
		return String.format("이름 : %s,나이 : %d세, 전화번호 : %s\n",name,age,telNo);
	}
	
	
	
	
}
