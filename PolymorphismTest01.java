package chap10_Interface;

public class PolymorphismTest01 {

	public static void main(String[] args) {
		System.out.println("\t@@@ 다형성 (Polymorphism) 테스트 @@@\n");
		
		CircleClass circle = new CircleClass(5);
		circle.areaCalculate();
		
		RectangularClass rectangular = new RectangularClass(15,20);
		rectangular.areaCalculate();

	}

}
