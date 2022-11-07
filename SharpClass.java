package chap10_Interface;

public abstract class SharpClass {

	protected int x,y,z;
	//생성자 중복 (constructor overloading)
	
	public SharpClass() {
		
	}
	
	public SharpClass(int x) {

		this.x = x;
	
		
	}
	

	public SharpClass(int x, int y) {

		this.x = x;
		this.y = y;
		
	}

	public SharpClass(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//추상 메소드
	public abstract void areaCalculate();
	
	
}
