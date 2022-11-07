package generics4;

public class StaticMemberTest_01 {

	public static void main(String[] args) {
		
		ChildInfo c1= new ChildInfo("박인비",31,"010-1111-2222");
		System.out.println(c1);
		
		ChildInfo c2 = new ChildInfo("장하나", 26, "010-3232-3434");
		
		System.out.println(c2);
		
		ChildInfo c3 = new ChildInfo("박세리",11,"010-8989-2323");
		System.out.println(c3);
		
		System.out.println();
		System.out.printf("static 멤버변수 cnt : %d\n",ChildInfo.cnt);
		System.out.printf("생성된 객체 개수      : %d\n",ChildInfo.getCnt());

	}

}
