package generics2;

public class Employee {

	public String name;
	public int age;
	//생성자로 멤버변수를 초기화
	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	//결과출력
	public void employeeInfo() {
		System.out.printf("선수    :이름 = %s , 나이 = %d 세\n",name,age);
	}
}
