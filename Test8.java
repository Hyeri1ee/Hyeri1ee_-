package test;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		//lab01();
		//lab02();
		//lab03();
		//lab04();
		//lab05();
		lab06();
	}

	public static void lab06() {//continue 문 사용 예
		//1에서 n까지의 정수 중 3의 배수의 합 구하기
		Scanner sc = new Scanner(System.in);
		int sum =0;
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		System.out.println();
		for (int i =1;i <= n;i++)
		{
			if (i %3 ==0) {
				System.out.printf("\n%d 인 경우는 3의 배수로 합에 누적됨 \n\n",i);
				sum += i;
			}
			else
			{
				System.out.printf("정수 %d은 3의 배수가 아님 \n",i);
				System.out.println("제어가 for문의 시작 위치로 이동\n");
				continue; //for문 시작 위치로 이동
			}
		}
		System.out.printf("\n1에서 %d 까지의 정수 중 3의 배수의 합 =%5d\n",n,sum);
		
	}

	public static void lab05() {//break문 사용 예2 : while문에서
		Scanner sc= new Scanner(System.in);
		int sum =0, cnt =0;
		while(true)
		{
			System.out.print("정수 입력 (종료시 -1 입력) : ");
			int i =sc.nextInt();
			if( i<0)
			{
				System.out.println("\n\t제어가 while문의 마지막으로 이동");
				break;
			}
			else
			{
				sum += i;
				cnt ++;
			}
		}//break문 실행되면 여기로 옴
		System.out.printf("\n입력된 개수 = %d\n",cnt);
		System.out.printf("총 합       =%d",sum);
		
		
	}

	public static void lab04() {/*break 문 사용 예1 : 
	break문이 반복문에 사용되면 현재 break문을 포함한 반복문의 실행이 중지되고 해당 블록을 벗어나게 된다.*/
		for (int i=1;i <=10;i++)
		{
			if (i >5)
			{
				System.out.println("\n\n\t반복문을 벗어나니다. (for문의 마지막으로 이동...)");
				break;
			}
			System.out.printf("\t%d",i);
		}//break만나면 여기로 이동
		System.out.println();
		System.out.println("\t5이상인 변수 i의 값은 출력 되지 않음");
		
		
	}

	public static void lab03() {//중첩된 반복문을 이용하여 부분 합과 총합 구하기
		Scanner sc = new Scanner(System.in);
		int total =0;
		System.out.print("정수 n 입력 :");
		int n = sc.nextInt();
		//중첩 for문
		for (int i =1;i<=n;i++)
		{
			int sum =0;
			for (int j=1; j<= i;j++)
			{
				sum += j; //소계 합 구하기
			}
			
			total += sum;//총계 합 구하기
		}
		System.out.printf("\n1 + (1+2) + (1+2+3) ... + (1+2+3+4+5+..+%d) 까지의 합 = %d\n",n,total);
	
		
	}

	public static void lab02() {//중첩된 반복문 이용해 구구단 작성
		int k;
		for (int i=2;i<=3;i++)
		{
			for (int j=1; j<=9;j++) 
			{
				k = i*j;
				System.out.printf("%d * %d = %d\n",i,j,k);
			}
			System.out.println(); //2단과 3단을 구분해주는 \n
		}

		
	}

	public static void lab01() {//개선된 for문 이용 예 : :
		int intArray []= {67,48,94,99,83,68,85,82,94,88};
		int sum =0;
		int arrayLength;
		double aver;
		
		arrayLength = intArray.length;
		
		for (int n: intArray)
			sum +=n;
		aver = ((double)sum /arrayLength);
		System.out.println("@@@ 배열의 내용 출력 @@@\n");
		for (int n: intArray)
			System.out.printf("  %-3d",n); //오른쪽으로 추가 여백이 생김
		System.out.println();
		System.out.printf("\n배열의 합 = %d\n",sum);
		System.out.printf("배열의 크기 = %d\n",arrayLength);
		System.out.printf("배열의 평균 : (double) %d / %d = %3.2f",sum,arrayLength,aver);
		
		
	}

}
