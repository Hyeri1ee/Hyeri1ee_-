package test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		//lab01();
		lab02();
		
		

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
