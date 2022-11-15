package test;

public class Test21 {

	public static void main(String[] args) {
		//HandPhone class 사용 예제
		//HandPhone class 로부터 객체 생성 (instance)
		
		HandPhone samsungHpc = new HandPhone();
		HandPhone iPhoneHpc = new HandPhone();
		HandPhone althlHpc = new HandPhone();
		
		//samsunHpc 객체에 초기값 부여
		samsungHpc.name = "이혜리";
		samsungHpc.phoneNumber = "01076263626";
		samsungHpc.address = "양천구 목동";
		
		
		//객체에 저장된 값 출력
		samsungHpc.ownerInfo();
		System.out.println();
		
		
		//iPhoneHpc 객체에 초기값 부여
		iPhoneHpc.name = "도지사";
		iPhoneHpc.phoneNumber = "01072341628";
		iPhoneHpc.address = "수원시 도봉구";

		
		//객체에 저장된 값 출력
		iPhoneHpc.ownerInfo();
		System.out.println();
		
		//전화를 걸거나 받는 메소드 호출
		samsungHpc.hangUp();
		iPhoneHpc.recieve();
	}

}
