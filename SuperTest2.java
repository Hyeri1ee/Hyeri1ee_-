package generics2;

public class SuperTest2 {

	public static void main(String[] args) {
		//Employee 클래스로부터 e 객체 생성
		System.out.println("@@@ 부모 생성자 호출 : super() @@@\n");
		Employee e = new Employee("손흥민",25);
		e.employeeInfo();
		
		//Manager 클래스로부터 m 객체 생성
		Manager m = new Manager ("슈틸리게",50,"서울시 중구");
		m.managerInfo();

	}

}
