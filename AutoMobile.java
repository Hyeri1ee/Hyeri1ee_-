package chap10_Interface;

public class AutoMobile extends VehicleClass {

	//추상메소드의 구현
	@Override
	public void start() {
		super.carInfo();
		System.out.println("자동차가 출발");
		engineState = true;

	}

	@Override
	public void stop() {
		super.carInfo();
		System.out.println("자동차가 정지");
		engineState = false;

	}

}
