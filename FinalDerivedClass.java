package generics4;

public class FinalDerivedClass extends FinalClass {

	public String address;

	public FinalDerivedClass(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}
	//printInfo() 메소드 overriding

	@Override
	public void printInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 주소 : %s\n",name,age,address);
	}
	
}
