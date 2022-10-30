package test;

public class Test6 {

	public static void main(String[] args) {
		byte byteType = 127;
		System.out.printf("byte 형 값 = %d\n",byteType);
		byteType = (byte) (byteType +1);
		System.out.println("\n@@@ byte 형 (8비트) 일때 Overflow 가 발생한 경우 @@@\n");
		System.out.printf("\"127 + 1\"의 경과 = %d\n",byteType);
		byteType = 127;
		short shortType = (short) (byteType +1);
		System.out.println("\n@@@ byte형(8비트)을 short 형(16비트)로 형 변환한 경우 @@@\n");
		System.out.printf("\"127 + 1\"의 결과 = %d\n",shortType);
	}

}
