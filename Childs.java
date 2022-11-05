package generics;

public class Childs extends Parents{

	String childName ="홍가을";
	int childAge =11;
	
	public void childInfo() {
		//상위 클래스의 멤버변수에 값을 할당 시 super.멤버변수 사용
		super.parentName = "홍길동";
		super.parentAge = 75;
		
		//상위 클래스의 parentInfo() 메소드를 사용시 super.메소드이름() 사용
		super.parentInfo();
		
		System.out.printf("나의 이름은 %s이고, 나이는 %d 세이다.\n",childName,childAge);
	}
}
