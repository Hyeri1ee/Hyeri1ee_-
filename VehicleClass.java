package chap10_Interface;

public abstract class VehicleClass {//추상클래스
	
	protected int wheelNumber= 4;
	protected boolean engineState = false;
	
	abstract public void start(); //추상 메소드
	abstract public void stop(); //추상 메소드
	
	public void carInfo() {
		System.out.printf("자동차 바퀴개수 : %d, 엔진상태 : %b\n",wheelNumber,engineState);
	}
	

}
