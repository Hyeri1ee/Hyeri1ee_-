package generics4;

public class FinalMethod {

	public String name;
	public int age;
	
	//생성자
	public FinalMethod(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.printf("이름 : %s, 나이 : %d\n",name,age);
	}

	
}
