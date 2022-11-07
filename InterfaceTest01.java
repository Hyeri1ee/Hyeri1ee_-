package chap10_Interface;

import java.util.Scanner;

public class InterfaceTest01 {
	
	static String answer;

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		do {
			System.out.printf("\n동물 선택 고양이(0), 개(1), 소(2)");
			int kind = sc.nextInt();
			IAnimal ia = getBikeKind(kind);
			System.out.println("\n@@@ 선택된 짐승의 울음 소리 @@@\n");
			//인터페이스로 선언된 메소드 수행
			System.out.println(ia.bike());
			System.out.print("\n계속하시겠습니까? (Y/y) : ");
			answer = sc.next();
		}while(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y"));
		System.out.println("\n!!! 프로그램을 종료함 !!!\n");
		
		
	}

	public static IAnimal getBikeKind(int kind) {
		IAnimal ia = null;
		switch(kind) {
		case 0:
			ia = new Cat();
			break;
		case 1:
			ia = new Dog();
			break;
		case 2:
			ia = new Caw();
			break;
		}
		return ia;
	}

}
