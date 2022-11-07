package generics3;

public class Animal {

	protected String name;
	protected int age;
	protected String color;
	
	public Animal(String name, int age, String color) {
		
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public void bark() {
		System.out.println("하하하~ ");
	}

	@Override
	public String toString() {
	
		return String.format("이름 : %s,나이 : %d세,색깔 : %s\n", name,age,color);
		
	}
	
}
