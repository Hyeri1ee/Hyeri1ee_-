package test;

public class Test11 {

	public static void main(String[] args) {
		//lab01();
		//lab02();
		lab03();
	}
	private static void lab03() {//2차원 배열을 이용하여 숫자 우삼각형 작성 및 출력
		//2차원 배열을 이용한 우삼각 행렬 작성
		int twoDimArr [][] = new int [5][5];
		for (int i=0;i < twoDimArr.length ; i++)
		{
			int k =0;
			for (int j =0 ;j <twoDimArr[i].length;j++)
			{
				++k;
				twoDimArr[i][j] = k;
				
			}
		}
		
		
	}

	private static void lab02() {//2차원 배열을 이용하여 숫자 좌삼각형 작성 및 출력
		//2차원 배열을 이용한 숫자 우삼각 행렬 작성
		int twoDimArr [][] = new int[5][5];
		int k =1;
		for (int i =0;i < twoDimArr.length;i ++)
		{
			for (int  j =0;j<=i;j++) //요기 부분이 뽀인뚜 !!!!!
			{
				twoDimArr [i][j] = k;
				System.out.printf("\t%-3d",k); //%-3d 가 %3d 보다 더 질서정연한 느낌
				k++;
				
			}
			System.out.println();
		}
		
		
	}

	private static void lab01() {//2차원 배열을 이용하여 숫자 사각형 작성 및 출력
		//2차원 배열의 선언 및 초기값 부여 후 출력
		int twoDimArr [][] = new int [3][4];
		int count = 1;
		//twoDimArr.length : 행의 크기인 3 반환
		
		for (int i =0;i <twoDimArr.length;i++)
		{
			for (int j =0;j<twoDimArr[i].length;j++)
			{
				twoDimArr[i][j] = count ++;
				
			}
		}
		System.out.println("\t @@@ 2차원 배열의 값 출력 @@@\n");
		for (int i =0;i <twoDimArr.length;i++)
		{
			for (int  j=0;j < twoDimArr[0].length;j++)
			{
				System.out.printf("%10d",twoDimArr[i][j]);
			}
			System.out.println();
		}
		
	}

}
