package generics2;

public class Professor extends Person {

	private String major;

	public Professor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public void printInfo() {
	
		super.printInfo();
		System.out.printf("전공\t: %s\n",major);
		System.out.println();
	}
	
	
	
}
