package chap10_Interface;

public class CircleClass extends SharpClass {

	protected int radius;
	
	public CircleClass(int radius) {
		
		this.radius = radius;
	}

	@Override//areaCalculate() 메소드를 오버라이딩하여 구현
	public void areaCalculate() {
		double area = 3.141592 * radius *radius;
		System.out.printf("\t원의\t 면적 = %f\n",area);

	}

}
