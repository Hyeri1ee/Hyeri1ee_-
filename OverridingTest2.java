package generics2;

public class OverridingTest2 {

	public static void main(String[] args) {
		Person person = new Person("이병헌",40);
		Professor professor = new Professor("김철수",55,"스마트ict공학과");
		
		person.printInfo();
		professor.printInfo();

	}

}
