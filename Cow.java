package generics3;

public class Cow extends Animal {

	public Cow(String name, int age, String color) {
		super(name,age,color);
	}

	@Override
	public void bark() {
		
		System.out.println("음메 음메~~");
	}
	
}
