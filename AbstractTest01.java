package chap10_Interface;

public class AbstractTest01 {

	public static void main(String[] args) {
		
		AutoMobile auto = new AutoMobile();
		auto.start();
		System.out.println();
		auto.stop();
		System.out.println();
		
		VehicleClass vc;
		vc = (VehicleClass)auto; //auto 실체화된 클래스를 업캐스팅하여 vc 추상 클래스의 멤버변수 사용
		auto.start();
		System.out.printf("\n자동차 바퀴개수 : %d, 엔진상태 : %b\n",vc.wheelNumber,vc.engineState);
		

	}

}
