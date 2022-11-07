package chap10_Interface;

public class RectangularClass extends SharpClass {

	protected int length;
	protected int width;
	
	
	public RectangularClass(int length, int width) {
		
		this.length = length;
		this.width = width;
	}


	@Override
	public void areaCalculate() {
		int area = length * width;
		System.out.printf("\t사각형의\t 면적 = %d\n",area);
	}

}
