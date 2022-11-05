package generics3;

public class PersonInfoTest2 {

	public static void main(String[] args) {
		PersonInfo_1 pi = new PersonInfo_1 ("이민정","010-2232-5622",21);
		
	
		String telNo = pi.getTelNo();
		int age = pi.getAge();
		System.out.println(pi.getName()+" : "+telNo + " : "+age);
		
		//멤버변수가 protected 인 경우엔 직접 접근하여 값을 저장가능
		pi.name = "이병헌";
		pi.telNo = "010-7872-9311";
		pi.age = 23;
		
		System.out.println(pi.name + " : "+ pi.telNo + " : "+pi.age);

	}

}
