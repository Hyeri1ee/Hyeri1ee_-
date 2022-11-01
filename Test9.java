package test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		//lab01();
		//lab02();
		//lab03();
		//lab04();
		//lab05();
		lab06();
		
		

	}


	public static void lab06() {
		Scanner sc = new Scanner(System.in);
		System.out.println("@@@ 되부름 메소드 이용 피보나치 수 구하기 @@@\n");
		System.out.print("정수 n 입력 : ");
		int n = sc.nextInt();
		System.out.println();
		for (int count =1 ;count <= n; count++)
		{
			//출력문에서 fib()피보나치 메소드 호출
			System.out.printf("피보나치 수 = %d\n",fib(count));
			
		}
		
	}


	private static long fib(int count) {
		
		long f;
		f = (count <= 2) ? 1 : fib(count-1) + fib(count-2);
		return f;
	
	}


	public static void lab05() {//재귀 메소드 1) factorial
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 n : ");
		int n = sc.nextInt();
		System.out.println();
		for (int i=1; i<=n;i++)
		{
			long retValue = factorial(i);
			System.out.printf("%d ! = %d\n",i,retValue);
			
			
		}
		
		
	}


	private static long factorial(int i) {//facotiral 함수
		if (i <= 1)
			return 1;
		else
			return i*factorial(i-1);
	}


	public static void lab04() {//return 예시문 2
		int a =100, b = 500;
		//메소드 호출 후 값만 넘겨 받는 경우
		int sum = add(a,b);
		System.out.printf("\n메소드 호출 후 리턴 되는 값   sum = %d\n",sum);
		
		
		
	}


	private static int add(int a, int b) {
		int total = a+b;
		System.out.printf("메소드 내에서 두 수의 합  total = %d\n",total);
		return total;
	}


	public static void lab03() {//return 예시문 1
		
		//(1) 단순히 메소드만 호출 후 제어권만 돌려 받는 경우
		calledMethodA();
		//(2) 메소드 호출 후 상수 값을 돌려 받는 경우
		int x = calledMethodB();
		System.out.printf("상수 값을 return 받은 경우      :x = %d\n\n",x);
		int a = 100;
		double b = 1.3;
		//(3) 두 값을 전달한 다음 그 결과를 돌려 받는 경우
		double y = calledMethodC(a,b);
		System.out.printf("계산 결과를 return 받은 경우     :y = %.2f\n\n",y);
		int cnt =100;
		//(4) 값을 넘겨준 다음 증가된 결과 값을 돌려 받는 경우
		int count = calledMethodD(cnt);
		System.out.printf("증가된 결과 값을 return 받은 경우 : count = %d\n\n",count);
		int s1 = 100,s2=200;
		//(5) 정수 값을 넘겨주고 불린 값을 돌려 받은 경우
		boolean boolValue = calledMethodE(s1,s2);
		System.out.printf("%d > %d = %b\n ",s1,s2 ,boolValue);
		System.out.println();
		//(6) 출력문에서 메소드 호출한 다음 결과를 출력하는 경우
		System.out.println(convert('A'));
		
		
	}


	private static char convert(char c) {
		if (c >= 'a' && c <= 'z')
			return (char) (c -32); //소문자를 대문자로
		else
			return (char) (c +32); //대문자를 소문자로
	}


	private static boolean calledMethodE(int s1, int s2) {
		// TODO Auto-generated method stub
		return s1>s2;
	}


	private static int calledMethodD(int cnt) {
		// TODO Auto-generated method stub
		return ++cnt;
	}


	private static double calledMethodC(int a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}


	private static int calledMethodB() {
		// TODO Auto-generated method stub
		return 3567;
	}


	private static void calledMethodA() {
		System.out.println("제어권만 main() 메소드로 돌려 주는 경우\n");
		return ;
		
	}


	public static void lab02() {
		//근무시간을 키보드로부터 입력 받은 다음의 처리 조건에 따라서 작업시간 당 임금을 계산하는 프로그램을 작성하시오.
		/*조건 : 
		 * 1)시간당 기본 수당은 9160
		 * 2)초과 수당은 기본수당의 1.5배(초과수당은 40시간 이상인 경우 지급)
		 * 3)총임금 = 기본수당  + 초과수당
		 */
		Scanner sc = new Scanner(System.in);
		System.out.printf("근무시간 입력 : ");
		int workingHour = sc.nextInt();
		int leftWorkingHour ;
		final double BasicWagePerHour = 4.10;
		double TotalBasicWage =workingHour * BasicWagePerHour;
		double TotalPremiumWage;
		
		
		if (workingHour >=40) {
			leftWorkingHour = workingHour-40;
			TotalPremiumWage = leftWorkingHour * BasicWagePerHour * 1.5;
			System.out.printf("근무시간 = %d 시간\n",workingHour);
			System.out.printf("기본임금 = %.1f 만원\n",TotalBasicWage);
			System.out.printf("초과수당 = %.1f 만원\n",TotalPremiumWage);
			System.out.printf("총 임금 = %.1f 만원\n",TotalBasicWage + TotalPremiumWage);
			

		}
		else {
			System.out.printf("근무시간 = %d 시간\n",workingHour);
			System.out.printf("기본임금 = %.1f 만원\n",TotalBasicWage);
			System.out.printf("총 임금 = %.1f 만원\n",TotalBasicWage);
		}
		
		System.out.println("\n최저시급이 4.10 만원이라니.. 사기야");
			
		
		
	}

	public static void lab01() {//반복문 연습문제 : 기간별 원리합계 구하기
		Scanner sc = new Scanner(System.in);
		int currency; //예금액
		double rate; //금리
		int year; //금리
		double sum;
		System.out.print("예금액 입력 : ");
		currency = sc.nextInt();
		System.out.print("금리 입력 : ");
		rate = sc.nextInt();
		System.out.print("기간 입력 : ");
		year = sc.nextInt();
		System.out.println();
		//기간별 원리합계 구하기
		System.out.println("    년도                  금액");
		System.out.println("=======================");
		for (int i=1;i<=year;i++) {
			sum = currency *((double)Math.pow(1.0+rate, i));
			System.out.printf(" %4d 년 %20.3f 원\n",i,sum);
		}
		System.out.println("========================");
		
		sc.close();
		
		
		
		
	}

}
