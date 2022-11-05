package generics;

import java.util.Iterator;
import java.util.Vector;

public class Collection2 {
	public static Vector <PsInfo> vec;
	public static void main(String[] args) {
		vec = new Vector <PsInfo> ();
		
		
		PsInfo p1 = new PsInfo ("한예슬",34,"강남구","010-7269-7474");
		PsInfo p2 = new PsInfo ("이진욱",28,"한남동","010-2822-1982");
		PsInfo p3 = new PsInfo ("강서지",22,"역삼동","010-1233-5672");
		PsInfo p4 = new PsInfo ("도진서",28,"구로구","010-1522-0091");
		PsInfo p5 = new PsInfo ("김학생",30,"LA","081-442-1332");
		
		vec.add(p1);
		vec.add(p2);
		vec.add(p3);
		vec.add(p4);
		vec.add(p5);
		
		memInfoList("=== 삽입한 회원 정보 확인 ===\n");
		System.out.printf("\n요소의 개수 : %d\n",vec.size());
		System.out.println();
		
		System.out.println("\'도진서\' 회원을 삭제한 경우");
		
		vec.remove(p4);
		System.out.printf("\n요소의 개수 : %d\n",vec.size());
		memInfoList("=== 삭제후 회원 정보 확인 ===\n");
		

	}
	public static void memInfoList(String string) {
		System.out.println(string);
		int i =0;
		Iterator <PsInfo> it = vec.iterator();
		while(it.hasNext()) {
			System.out.printf("[%d] %s\n",i,it.next());
			i++;
		}
		
	}

}
