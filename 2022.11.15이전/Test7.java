package test;

import java.util.Scanner;

public class Test7 {

	public static void lab01() {//제어문 if else
		Scanner in = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = in.nextInt();
		//if 문에서 정수형의 크기를 비교
		if (score >=90)
			System.out.println("\n참 잘 했어요!!!");
		else
			System.out.println("\n분발하세요!!!");
		System.out.printf("당신의 점수는 %d 점 입니다.",score);
		in.close();
	}
	
	public static void lab02() {//문자열 비교 비교문
		Scanner in = new Scanner(System.in);
		System.out.print("성별 입력 남성(M) 여성(F) : ");
		String sex = in.next();
		//equalsIgnoreCase("M") : 문자열을 대소문자 구분하지 않고 비교하는 경우에 사용
		//equals :문자열 비교할 때 대소문자도 비교
		if (sex.equalsIgnoreCase("M")) {
			System.out.println("\n당신은 남성입니다.");
			System.out.printf("입력된 값 : %s\n",sex);
			
		}
		else
		{
			System.out.println("\n당신은 여성입니다.");
			System.out.printf("입력된 값 : %s\n",sex);
		}
	}
	public static void main(String[] args) {
		//lab01();
		//lab02();
		//lab03();
		lab04();
	}

	public static void lab04() {//do while 문에서 무한루프를 이용하여 정수의합 구하기 예
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("n값 입력 : ");
		int n = sc.nextInt();
		int i =1;
		//do while문
		do {
			if (i>n)
				break;//무한루프를 빠져나올 수 있는 부분
			else
				sum += i;
			i++;
		}while(true);
		System.out.printf("\n무한루프를 이용하여 1에서 %d까지의 정수의 합 = %d\n",n,sum);
		
		
	}

	public static void lab03() {//switch~case 문 이용하여 학점 구하기
		Scanner sc= new Scanner(System.in);
		int score; char grade;
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		//switch~case문을 이용하여 5단계 학점 구하기
		switch (score/10 )  //정수 / 정수 = 정수
		{
		case 10: //100점인 경우
		case 9: grade ='A'; break; //90점 ~99점인 경우
		case 8: grade ='B'; break; //80점 ~89점인 경우
		case 7: grade = 'C'; break; //70점 ~79점인 경우
		case 6: grade ='D'; break; //60점 ~69점인 경우
		default: grade ='F'; break; //0점~ 59점인 경우
		
		}
		System.out.printf("\n%d점은 \'%c\' 학점이다.\n",score,grade);
	}

}
