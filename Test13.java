package test;

public class Test13 {

	public static void main(String[] args) {
		lab01();
		
	}

	public static void lab01() {//2차원 배열을 이용하여 행렬의 합과 순위 구하기 예
		int x [][] = {
				{7,1,5,2,0,0},
				{6,7,8,9,0,0},
				{1,2,3,5,0,0},
				{6,2,8,9,0,0},
				{3,3,4,5,0,0}
		};
		
		sumArray(x); //배열에서 행의 합을 구하는 메소드 호출
		System.out.println("\n\t@@@ 2차원 배열에서 각 행의 합을 계산한 결과를 출력 @@@\n");
		printResult(x);
		arraySort(x); //각 행의 합을 기준으로하여 내림차순 정렬하는 메소드 호출
		System.out.println("\n\t@@@ 2차원 배열에서 각 행의 합을 기준으로 내림차순으로 정렬된 결과 출력 @@@\n");
		printResult(x);
		rankCal(x); //내림차순으로 정렬된 값을 이용하여 순위를 구하는 메소드  호출
		System.out.println("\n\t@@@ 2차원 배열에서 각 행의 합을 기준으로 순위가 부여된 결과 출력 @@@\n");
		printResult(x);
		
		
		
	}

	private static void rankCal(int[][] x) {//내림차순으로 정렬된 값을 이용하여 순위를 구하는 메소드  호출 <요기가 코드의 핵심 부분1>
		int t =1;
		x[0][5] = t;
		for (int i =0; i <x.length -1 ;i++)
		{
			t++;
			//동점자인 경우 동점자 순위 부여
			if (x[i][4] == x[i+1][4])
				x[i+1][5] = x[i][5];
			else
				x[i+1][5] = t;
		}
		
		
	}

	private static void arraySort(int[][] x) {//각 행의 합을 기준으로하여 내림차순 정렬하는 메소드 호출 <요기가 코드의 핵심 부분2>
		//2차원 배열을 내림차순으로 정렬
		for (int i =0 ;i < x.length ;i++)
		{
			for (int j =i+1; j<x[i].length - 1 ;j++)
			{
				//각 행의 총점을 비교하여 내림차순으로 정렬
				if (x[i][4] > x[j][4])
					for (int k =0; k<6; k++)
					{
						//2차원 배열의 위치 교환 
						swap(x,i,j,k);
					}
			}
		}
		
	}

	private static void swap(int[][] x, int i, int j, int k) {//두 행의 모든 열의 위치 교환 함수
		int temp = x[j][k];
		x[j][k]= x[i][k];
		x[i][k] =temp;	
		
	}

	private static void printResult(int[][] x) {//행과 열 전체 결과 출력
		for (int i =0;i <x.length ;i ++)
		{
			for (int j =0;j <x[i].length ;j++)
			{
				System.out.printf("\t %-3d",x[i][j]);
			}
			System.out.println();
		}
		
		
	}

	private static void sumArray(int[][] x) {//배열에서 행의 합을 구하는 메소드 호출
		//행렬에서 0열에서 3열까지 합을 구한 다음 각 행의 4열에 저장
		System.out.println("\t    @@@ 5 * 6 행렬에서 각 행의 합 구하기 @@@\n");
		for (int i =0; i < x.length;i++)//행
		{
			int sum =0; //각 행의 0열부터 3열까지 합
			for (int j =0; j<4 ;j++)//열
			{
				sum += x[i][j];
			}
			x[i][4] = sum;
		}
	
		
	}

}
