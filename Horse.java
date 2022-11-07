package generics3;

public class Horse extends Animal {

	public Horse(String name, int age, String color) {
		super(name, age, color);
		
	}

	@Override
	public void bark() {
		System.out.println("히힝 히힝!~");
	
	}

	
}
