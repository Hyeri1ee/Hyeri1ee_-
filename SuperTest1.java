package generics;

public class SuperTest1 {

	public static void main(String[] args) {
		//parents 클래스로 부터 parents 객체 생성
		Parents parents = new Parents();
		parents.parentInfo();
		System.out.println();
		
		//parents 클래스로 부터 상속 받아서 childs 객체 생성
		Childs childs = new Childs();
		childs.childInfo();
		parents.parentInfo();

	}

}
