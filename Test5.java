package test;

import java.io.IOException;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자 [A~Z] / [a~z] 중 입력 : ");
		//키보드로 부터 한 문자 입력 받음
		
		int oneChar = System.in.read();
		System.out.printf("입력된 문자 : \'%c\' ",(char)oneChar);
		System.out.println();
		//입력된 문자의 ASCII 코드 값으로 변환
		System.out.printf("입력된 문자의 ASCII Code 값 : %d\n",oneChar);
		//키보드로 부터 입력 받기 위해서 Scanner 클라스 객체 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("ASCII 코드 값 입력 : ");
		int asCode = sc.nextInt();
		System.out.printf("입력된 ASCII Code 값은 %d 이고, 이 코드 값에 해당되는 문자는 \'%c\'이다.",asCode,(char)asCode);
		

	}

}
