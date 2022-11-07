package generics4;

public class FinalMethodTest01 {

	public static void main(String[] args) {
		FinalMethod finalMethod = new FinalMethod("백종원",51);
		FinalDerivedClass fid = new FinalDerivedClass("소유진",35, "서울시 중구");
		System.out.println("@@@ Final 메소드 테스트 @@@");
		finalMethod.printInfo();
		fid.printInfo();

	}

}
