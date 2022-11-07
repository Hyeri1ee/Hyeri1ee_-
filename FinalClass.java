package generics4;

public class FinalClass {

	public String name;
	public int age;
	
	//생성자
	public FinalClass(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	//멤버변수에 저장된 값을 출력
	public void printInfo() {
		System.out.printf("이름 : %s , 나이 : %d\n",name,age);
	}
	
	
	
}
