package generics;

import java.util.ArrayList;

public class Collection3 {
	public static ArrayList <Integer> list = new ArrayList <Integer>();

	public static void main(String[] args) {
		for (int i =0;i< 5; i++)
		{
			list.add(i);
			
		}
		System.out.println("List에 입력된 내용 \n");
		prtList();
		list.remove(2);
		System.out.println("List에서 2번째 요소를 삭제한 경우\n");
		prtList();
		list.add(2,13);
		System.out.println("List에서 2번째 요소에 13을 삽입한 경우\n");
		prtList();
		list.set(4,1000);

	}

	public static void prtList() {
		for (Integer it : list)
			System.out.printf("\t%d",it);
		System.out.println();
		
	}

}
