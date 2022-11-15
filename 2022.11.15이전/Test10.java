package test;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		//lab01();
		//lab02();
		lab03();

	}

	private static void lab03() {//1차원 배열 사용하여 총점 및 평균 구하기 예
		//20개 이내의 자료를 입력 받아서 1차원 배열에 저장한 다음
		//총점 및 평균 구하기
		//단 , 입력 성적이 -1이면 무한루프를 종료한다.
		Scanner sc = new Scanner(System.in);
		int score[] = new int[20];
		int i=0,count =0, sum =0;
		double average;
		System.out.println("점수 입력\n");
		
		//do ~ while 문의 무한루프 이용
		do
		{
			System.out.print("배열 ["+i+"] 번째 = ");
			int x = sc.nextInt();
			if (x < 0) break; //입력 받은 값이 0보다 적으면 종료
			score [i] = x;
			i++;
			count++;
		}while(true);
		
		System.out.println("\n입력된 값 출력\n");
		
		for(i = 0;i<count;i++)
		{
			System.out.printf("score [  %2d] = %d\n",i,score[i]);
		}
		
		i =0;
		while(i<count) {
			sum += score[i];
			i++;
		}
		average = (double)sum / count;
		System.out.println();
		System.out.printf("총점  = %d , 평균 %.2f\n",sum,average);
		
		
	}

	private static void lab02() {//1차원 배열 사용하여 배열선언과 동시에 초기화 하는 경우
		//1차원 배열 선언과 동시에 배열을 초기화
		int intArr [] = new int[] {100,200,300,400,500};
		
		System.out.println("@@@ 배열의 선언과 동시에 초기화 @@@\n");
		System.out.printf("배열의 크기 = %d\n",intArr.length);
		System.out.println();
		
		//1차원 배열에 저장된 정수 값을 출력
		for (int i=0;i<intArr.length;i++)
		{
			System.out.printf("intArr [%d] = %d\n",i,intArr[i]);
			
		}
		
		
	}

	private static void lab01() {//1차원 배열 사용하여 배열 선언 후 초기화 하는 경우
		
		//1차원 정수형 배열을 선언 : 배열의 크기 5
		int intArr[] = new int[5];
		System.out.println("@@@ 배열의 선언 후 배열의 각 요소 초기화 @@@\n");
		//1차원 배열에 초기값 부여
		intArr [0] = 100;
		intArr [1] = 200;
		intArr [2] = 300;
		intArr [3] = 400;
		intArr [4] = 500;
		
		//1차원 배열에 저장된 값을 출력
		for (int i =0; i< 5; i++)
		{
			System.out.printf("intArr [%d] = %d\n",i,intArr[i]);
		}
		
		
	}

}
