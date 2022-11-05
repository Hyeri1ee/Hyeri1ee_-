package generics2;

public class Manager extends Employee {

	public String address;

	public Manager(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}
	
	public void managerInfo() {
		System.out.printf("감독    :이름 = %s, 나이 = %d 세, 주소 = %s\n",name,age,address);
	}
}
