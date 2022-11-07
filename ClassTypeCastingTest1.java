package generics3;

public class ClassTypeCastingTest1 {

	public static void main(String[] args) {
		Cow cow = new Cow("누렁이",2,"노란색");
		System.out.print("Cow\t: "+cow.toString()+",");
		cow.bark();
		
		Horse horse = new Horse("적토마",3,"검정색");
		System.out.print("Horse\t: "+horse.toString()+","); //자식클래스가 부모클래스의 tostring 메소드 사용
		horse.bark();
		
		Animal animal = new Animal("",0,"");
		System.out.print("Animal\t: "+animal.toString()+",");
		animal.bark();
		
		animal = cow;//cow 클래스를 animal 클래스에 치환
		System.out.print("Animal : "+animal.toString()+",");
		animal.bark();
		
		
		
		

	}

}
