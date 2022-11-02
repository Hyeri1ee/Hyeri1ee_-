package test;

public class HandPhone {//main 실행하는 class :Test21
	//멤버 변수 선언
	String phoneNumber;
	String name;
	String address;
	
	//메소드 작성
	public void hangUp() {//전화걸기
		System.out.printf("%S 에게 %s 번호로 전화를 건다.\n",name, phoneNumber);
		
		
	}
	
	public void recieve() {//전화받기
		
		System.out.printf("%s 가 %s 번호로 부터 전화를 받는다.\n",name,phoneNumber);
	}

	public void ownerInfo() { //주인 정보 알려주기
		System.out.printf("이름 :  %s\n",name);
		System.out.printf("주소 :  %s\n",address);
		System.out.printf("핸드폰번호 : %s\n",phoneNumber);
	}
}
