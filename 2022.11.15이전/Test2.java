package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String schoolNumber;
		String studentName;
		schoolNumber = "202211354";
		studentName = "이혜리";
		System.out.println("@@@ 문자열 출력 @@@");
		System.out.println();
		System.out.printf("학생의 학번은 \"%s\" 이고, 이름은 \"%s\" 이다.",schoolNumber,studentName);
		System.out.println("\n");
		System.out.println("문자열 출력 자리수          :1234567890");
		System.out.printf("왼쪽 정렬          :%-10d\n",20);
		System.out.printf("오른쪽 정렬          :%10d\n",20);
		System.out.println("\n");
		System.out.println("@@@ 숫자형 출력 @@@");
		System.out.printf("10진 정수형      : %d\n",99);
		System.out.printf("8 진 정수형      : %o\n",99);
		System.out.printf("16진 정수형      : %x\n",99);
		System.out.println("\n");
		System.out.printf("고정소숫점수      : %3.2f\n",99.9999);
		System.out.printf("지수형          : %e\n",99.9);
		System.out.printf("부동소숫점수      : %g\n",99.9);

	}

}
