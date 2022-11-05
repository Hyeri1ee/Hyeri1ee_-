package generics;

import java.util.ArrayList;

public class Collection4 {

	public static ArrayList<Object> list = new ArrayList<Object>();
	public static void main(String[] args) {
		list.add("홍길동");
		list.add(1);
		list.add('A');
		list.add(34.22);
		list.add("제니퍼");
		
		System.out.println("list에 입력된 내용\n");
		prtList();
		list.remove(2);
		System.out.println("\nlist에서 2번째 요소를 삭제한 경우\n");
		prtList();
		list.add(2,"각시탈");
		System.out.println("\nlist에서 2번째 요소에 \'각시탈\'을 삽입한 경우\n");
		prtList();
		System.out.println("\nlist에서 3번째 요소를 \'parksanjang\'을 삽입한 경우\n");
		list.set(3, "parksanjang");
		prtList();

	}
	public static void prtList() {
		for (Object it :list)
			System.out.printf("\t%s",it);
	    System.out.println();
	
		
	}

}
