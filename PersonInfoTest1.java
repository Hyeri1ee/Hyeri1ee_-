package generics3;

public class PersonInfoTest1 {

	public static void main(String[] args)
	{
		//생성자를 통해서 초기값 전달
		PersonInfo pi = new PersonInfo("이민정","010-7626-3933",23);
		String telNo = pi.getTelNo();
		int age = pi.getAge();
		System.out.println(pi.getName()+ " : "+telNo + " : "+age);
		
		//멤버변수가 private 인 경우는 set or get 메소드 *** 를 통해서 접근 가능
		pi.setName("이병헌");
		pi.setTelNo("010-2822-3333");
		pi.setAge(12);
		
		String name = pi.getName();
		telNo = pi.getTelNo();
		age = pi.getAge();
		System.out.println(name + " : " +telNo +" : "+age);
	}
	
}
