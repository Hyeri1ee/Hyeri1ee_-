package test;

import java.text.DecimalFormat;

public class Test3 {

	public static void main(String[] args) {
		// DecimalFormat Class using
		//'0' 과 '#' 차이점 : '0'은 나머지 소수점을 0 채워서 출력하고 / '#'은 나머지 남는 부분을 출력하지 않는다.
		double total =123456789.7789;
		double sum = 4123123123431000.0;
	    double tax = 0.045;
	    
	    int countValue =1000000;
	    int zeroValue =12313190;
	    
	    DecimalFormat df1 = new DecimalFormat("#,###.000 $");
	    System.out.println(df1.format(total));
	    System.out.println(df1.format(sum));
	    
	    DecimalFormat df2 = new DecimalFormat("#,###.00 %");
	    System.out.println(df2.format(tax));
	    
	    DecimalFormat df3 = new DecimalFormat("#,##00 개");
	    //정수형의 자릿수가 2개 미만: 0을 포함한 전체 자릿수가 2개가 되도록 출력됨
	    //정수형의 자릿수가 2개 이상: 정수형을 4개 단위로 끊어서 출력됨
	    System.out.println(df3.format(countValue));
	    System.out.println(df3.format(zeroValue));

	}

}
