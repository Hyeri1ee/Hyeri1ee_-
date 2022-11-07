package generics4;

public class FinalClassTest01 {

	public static void main(String[] args) {
		
		FinalClass finalClass = new FinalClass("이병헌",40);
		FinalDerivedClass fid = new FinalDerivedClass("이민정",22,"서울시 종로구");
		
		System.out.println("@@@ Final Class 테스트 @@@");
		finalClass.printInfo();
		fid.printInfo();

	}

}
