package test;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		//lab01();
		lab02();

	}

	public static void lab02() {//배열의 응용 : 버블 정렬
		//배열 만들기
		Scanner sc = new Scanner(System.in);
		int score [] = new  int [] {1,5,2,7,10,34,-23,6,90};
		System.out.println("\t@@@ 1차원 배열 응용 (bubble sort) @@@\n");
		
		System.out.println("\t  ***** 입력된 데이터 *****\n");
		printResult(score);
		
		System.out.println();
		sortData(score);
		
		System.out.println();
		System.out.println("\t  ***** 오름차순으로 버블 정렬된 데이터 *****\n");
		printResult(score);
		
		sc.close();
	} 

	private static void sortData(int[] score) {//버블 정렬 함수
		for (int i =0;i<score.length-1;i++)
		{
			for (int j = 0 ;j < score.length - 1-i;j++)
			{
				if (score[j] > score[j + 1]) // 왼쪽의 값 > 오른쪽의 값
				{
					int temp;
					//1차원 배열 내의 값을 교환 두 값을 교환
					temp = score[j];
					score [j] = score [j+1];
					score[j+1] = temp;
					
					
				}
			}
		}
		
	}

	private static void printResult(int[] score) {
		for (int i =0; i<score.length ;i++)
		{
			System.out.printf("\t%3d",score[i]);
		}
		
	}

	private static void lab01() {//call by reference 방법에 의한 매개변수 전달 및 반환 예
		int [] arr= {10,20,30,40,500};
		System.out.println("호출 전 배열에 저장된 값 출력\n");
		for(int i =0;i<arr.length;i++)
		{
			System.out.printf("arr[%-3d] = %d\n",i,arr[i]);
			
		}
		System.out.println();
		
		//call by reference 로 인수 전달
		//1차원 배열을 인수로 전달 (주소에 의한 전달 방법 사용)
		calledMethod(arr,30); //arr배열 각 원소에 30을 곱한 값을 넣기
		System.out.println("메소드 호출 후 call by reference 방법으로 돌려 받은 값\n");
		
		for (int i=0;i <arr.length;i++)
		{
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
		System.out.println("call by reference 방법에 의한 매개변수 전달은 값 변환후에도 값이 변환된 상태임을 알 수 있다.");
	}

	private static void calledMethod(int[] arr, int i) {
		for (int j =0;j<arr.length;j++)
		{
			arr[j] *= i;
		}
		
		System.out.println("호출된 메소드 내에서 계산된 결과\n");
		
		for (int j =0;j<arr.length;j++)
		{
			System.out.printf("arr[%d] = %d\n",j,arr[j]);
		}
		System.out.println();
			
		
	}

}
