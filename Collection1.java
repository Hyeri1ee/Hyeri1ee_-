package generics;

import java.util.Iterator;
import java.util.Vector;

public class Collection1 {

	public static Vector <Integer> vec;
	public static void main(String[] args) {
		
		
		vec = new Vector <Integer>();
		//벡터에 정수형 데이터 3개 삽입
		vec.add(100);
		vec.add(200);
		vec.add(300);
		vecInfoList("++++삽입된 벡터 값 출력++++\n");
		System.out.printf("\n요소의 개수 : %d\n",vec.size());
		vec.add(400);
		vec.add(500);
		vecInfoList("++++추가된 다음 벡터 값 출력++++\n");
		System.out.printf("\n요소의 개수 : %d\n",vec.size());
		System.out.println("\nVector[2] 번째 요소 삭제\n");
		vec.remove(2);
		vecInfoList("++++삭제된 다음 벡터 값 출력++++\n");
		System.out.printf("\n요소의 개수 : %d\n",vec.size());
	}
	public static void vecInfoList(String string) {
		System.out.println(string);
		int i =0;
		Iterator <Integer> it = vec.iterator();
		while(it.hasNext()) {
			System.out.printf("Vector vec [%d] 번째의 값 = %d\n",i,it.next());
			i++;
		}
		
	}

}
