package eXecption;

import java.util.Scanner;
class OutOfIntegerClassException extends RuntimeException{

	public OutOfIntegerClassException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
public class InTeger {

	public static void main(String[] args) {
		
		Integer obj1 = null;
		Integer obj2 = null;
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("비교하고자 하는 두 값을 입력하세요.");
				System.out.println("-128~127");
				System.out.printf("obj1 값 입력 : ");
				obj1 = sc.nextInt();
				System.out.printf("obj2 값 입력 : ");
				obj2 = sc.nextInt();
				
				System.out.println("Integer 클라스 박싱 후 == 결과 : "+(obj1 == obj2));
			}catch(OutOfIntegerClassException e) {
				System.out.println(e.getMessage());
				System.out.println("Integer 클라스 언박싱 후 == 결과 : "+(obj1.intValue() == obj2.intValue()));
			}
			
		}
		

	}

}
