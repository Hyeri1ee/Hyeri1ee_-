import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class VocManager {

	private String userName;
	private HashMap<String , Word> voc = new HashMap<>();
	 //voc hasmap자료형에서 value의 값을 무작위로 얻을 수 있도록 List로 참조한 자료형 생성
	private List<String> keyList = new ArrayList<>(voc.keySet());
	private List<Word> valueList = new ArrayList<>(voc.values());
	
	//오답 노트에 쓰이는 자료들
	//1. 오답단어들의 출제회수
	private HashMap<String, Integer> miss_words_q = new HashMap<>();
	//2. 오답단어들의 오답회수
	private HashMap<String, Integer> miss_words_n = new HashMap<>();
	
	
	
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	

	//사용자 이름 받는 생성자
	public VocManager(String userName) {
		super();
		this.userName = userName;
	}
	
	//파일 읽어들일 때 사용되는 메소드
	void addWord(String s, Word word) {
		
		voc.put(s, word);
		
	}
	
	
	//파일 읽어들이기 (HashMap)
	void makeVoc(String fileName) {
		
		try(Scanner scan = new Scanner(new File(fileName))){
			while(scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] temp = str.split("\t");
				this.addWord(temp[0].trim(),new Word(temp[0].trim(),temp[1].trim()));
			}
			System.out.println(userName+"의 단어장이 생성 되었습니다.");
			
			this.menu();
			
		}catch(FileNotFoundException e) {
			System.out.println(userName+"의 단어장이 생성되지 않았습니다.\n 파일명을 확인해주세요.");
			System.out.println(e.getMessage());
		}
		
	}
	
	//메뉴 출력
	void menu() {
		int choice  = 0;
		while(choice != 5) {
			System.out.println("\n------- "+userName+"의 영단어 퀴즈 -------");
			System.out.println("1) 주관식 퀴즈 2) 객관식 퀴즈 3) 오답노트 4) 단어검색 5) 종료");
			System.out.printf("메뉴를 선택하세요 : ");
			choice = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			switch(choice) {
			case 1:
				quiz1();
				break;
			case 2:
				quiz2();
				break;
			case 3:
				quiz3();
				break;
			case 4:
				quiz4();
				break;
			case 5:
				System.out.println(userName + "의 단어장 프로그램을 종료합니다.");
				break;
			}
		}
	}

	public void quiz4() {
		 // 단어검색
		//1. (try~catch 구문사용해서) 오답이 없는 경우 /와/ 영단어를 잘못 입력한 경우 꼭 출력
		String user_eng_input = scan.nextLine().trim();
		for (String p : voc.keySet()) {
			if (p.equals(user_eng_input)) {
				
				//오답횟수
				//miss_words_n.Entry 리스트 작성
				List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(miss_words_n.entrySet());
				
				
				// 비교함수 Comparator를 사용하여 오름차순으로 정렬
				Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
					// compare로 값을 비교
					public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
					// 오름 차순 정렬
					return obj1.getValue().compareTo(obj2.getValue());
					}
				});
				
				
//				// 결과 출력
//				for(Entry<String, Integer> entry : list_entries) {
//				System.out.println(entry.getKey() + " : " + entry.getValue());
				
				
				
				System.out.println();
				
				
				for (String o : voc.keySet()) {
					System.out.printf(o+"뜻 : "+voc.get(o).kor); //영어 단어 , 한글 단어 출력
					
					System.out.println();
					
					
					System.out.printf("출제횟수 : "+miss_words_q.get(o)+"\t");
					System.out.printf("오답횟수 : "+miss_words_n.get(o));
					
					System.out.println();
					
				}
					
					System.out.println();
					
			}}
				
			
		}
	

	public void quiz3() {
		// 오답노트
		//오답횟수가 가장 많은 단어부터 출력
		//1. (try~catch 구문사용해서) 오답이 없는 경우 꼭 출력
		
		//오답횟수
		//miss_words_n.Entry 리스트 작성
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(miss_words_n.entrySet());
		
		
		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
			// 오름 차순 정렬
			return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		
		
//		// 결과 출력
//		for(Entry<String, Integer> entry : list_entries) {
//		System.out.println(entry.getKey() + " : " + entry.getValue());

		System.out.println();
		
			
		for (String o : voc.keySet()) {
			System.out.printf(o+"뜻 : "+voc.get(o).kor); //영어 단어 , 한글 단어 출력
			
			System.out.println();
			
			
			System.out.printf("출제횟수 : "+miss_words_q.get(o)+"\t");
			System.out.printf("오답횟수 : "+miss_words_n.get(o));
			
			System.out.println();
			
		}
			
			System.out.println();
		}
	

	
	public void quiz2() {
		//객관식 퀴즈
		
		//1. 답지에만 출제된 경우 같은 뜻을 가진 단어들의 출제 회수를 모두 늘려준다. : 해결 코드 미완
	   
		List<String> keyList = new ArrayList<>(voc.keySet());
	    List<Word> valueList = new ArrayList<>(voc.values());
		HashMap<Integer,Word> may_answer = new HashMap<>(4);
		List <Integer> random_value_number = new ArrayList<>(4);
		List <Integer> correct = new ArrayList<>(); //맞으면 1, 틀리면 0 값 넣기
		List<Integer> random_key_number = new ArrayList<>(4);
		
		
		int test_num = 10;
		long startTime , endTime;
		
		startTime = System.nanoTime();//시작 시각
		for(int i =1 ;i<= test_num;i++){
			
			System.out.printf("------ 객관식 퀴즈 %d번 ------",i);
			System.out.println();
			
			random_key_number = put_random_value_number(random_value_number,valueList); //랜덤 값이 중복 안되게 random_value_number 에 넣기 //수 중복 안되게 , 글자 중복 안되게 equals override
			String n = keyList.get(random_key_number.get(rand.nextInt(4)));
			System.out.printf("\""+n+"\""+"의 뜻을 가진 영어 단어는 무엇일까요?");
			System.out.println();
			
			may_answer = final_may_answer(random_value_number,valueList,may_answer); //random_value_number에 해당하는 voc.value 값과 수 hashmap에 입력해서 출력

			System.out.printf("\n답을 입력하세요 : ");

			
			
			int user = sc.nextInt();
			if (may_answer.get(user).eng == n) {
				System.out.println("정답입니다.");
				correct.add(1);
			}
			else {
				System.out.printf("틀렸습니다. 정답은 "+getKey(may_answer,n)+" 입니다.");
				System.out.println();
				correct.add(0);
				
			}
			
			//오답단어들 관련 메소드 (저장용)
			//1. 오답단어들의 출제 회수 = question hashmap
			//틀린 단어 : keyList.get(j) // miss_words_q : <String, Integer> Hashmap
			miss_method1(n,miss_words_q);
			//2. 오답단어들의 오답 회수 = miss hashmap
			miss_method2(n,miss_words_n);
			
			may_answer.clear();
			random_value_number.clear();
			random_key_number.clear();
		}

		endTime = System.nanoTime();//종료 시각
		
		
		System.out.printf(userName+"님 10문제 중 %d 개 맞추셨고, 총 "+(double)(endTime - startTime)/1000000000+"초 소요되었습니다.", correctNum(correct));
		
	}


	public Integer getKey(HashMap<Integer, Word> may_answer, String n) {
		for (Word w : may_answer.values()) {
			if (w.eng.equals(n)) {
			
				
				for (Integer key : may_answer.keySet()) {
					if (w == may_answer.get(key))
					{
				         return key;
					}
					
				}
			}
		}
		return null;
	}

	public HashMap<Integer,Word> final_may_answer(List<Integer> random_value_number, List<Word> valueList,
			HashMap<Integer, Word> may_answer) {
		
		
		//hasmap 자료형 may_answer에 key값, value값 입력
		int i = 1;
		for (Integer k : random_value_number) {
			Word w = valueList.get(k);
			may_answer.put(i, w);
			i++;
		}
			
		//hashmap 자료형 출력
		Set<Entry<Integer, Word>> set = may_answer.entrySet();
		Iterator<Entry<Integer, Word>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Integer, Word> entry = it.next();
			Integer key = entry.getKey();
			Word value = entry.getValue();
			System.out.println(key + ") "+ value.kor);
		}
		return may_answer;
		
		
	}

	public List<Integer> put_random_value_number(List<Integer> a, List<Word> list) {
		
		//랜덤 값 중복 없이 넣어주기
		for (int i =0 ; i <4;i++)
		{
			int j = rand.nextInt(voc.size());
			a.add(j);
			for (int k=0;k<i;k++)
			{
				if(a.get(i) == a.get(k))
				{
					i--;
				}
			}
		}
		return a;
		
		
	}

	public void quiz1() {
		//주관식 퀴즈
		//1. 같은 한글 뜻 단어 가진 영단어의 경우 복수 정답 처리 : 해결 코드 미완.
	
		
		int test_num = 10;
		long startTime , endTime;
		
		List<String> keyList = new ArrayList<>(voc.keySet());
	    List<Word> valueList = new ArrayList<>(voc.values());
		
		List <Integer> arr = new ArrayList<>(); //출제된 단어들 저장하기 위해 생성 (중복 해결 , 출제 몇번 했는지 세기)
		List <Integer> correct = new ArrayList<>(); //맞으면 1, 틀리면 0 값 넣기
		
		startTime = System.nanoTime();//시작 시각
		for(int i =1 ;i<= test_num;i++){
			
			System.out.printf("------ 주관식 퀴즈 %d번 ------",i);
			System.out.println();

			
			int j = rand.nextInt(voc.size()); //랜덤 수 설정
			arr.add(j); //출제된 랜덤 단어 j arr ArrayList 자료형에 저장하기
			

			System.out.printf("\""+valueList.get(j).kor+"\""+"의 뜻을 가진 영어 단어는 무엇일까요?");
			System.out.printf("\n답을 입력하세요 : ");

			
			String user = sc.nextLine().trim();
			if (user.equals(keyList.get(j))) {
				System.out.println("정답입니다.");
				correct.add(1);
			}
			else {
				System.out.printf("틀렸습니다. 정답은 "+keyList.get(j)+" 입니다.");
				System.out.println();
				correct.add(0);
				
				//오답단어들 관련 메소드 (저장용)
				//1. 오답단어들의 출제 회수 = question hashmap
				//틀린 단어 : keyList.get(j) // miss_words_q : <String, Integer> Hashmap
				miss_method1(keyList.get(j),miss_words_q);
				//2. 오답단어들의 오답 회수 = miss hashmap
				miss_method2(keyList.get(j),miss_words_n);
			}
			
		
			
		}
			endTime = System.nanoTime();
			
			
		
		System.out.printf(userName+"님 10문제 중 %d 개 맞추셨고, 총 "+(double)(endTime - startTime)/1000000000+"초 소요되었습니다.", correctNum(correct));
	}

	

	public HashMap<String,Integer> miss_method2(String string_key, HashMap<String, Integer> miss_words_n) {
		//1. 오답단어들의 오답 횟수 = question hashmap
		//miss_words_q 에 String자리에는 string_key 값 넣고,
		//Integer 자리에는 1씩 증가된 값 넣기
		int a =1 ;
		if (!( miss_words_n.containsKey(string_key))) //miss_words_q 의 key 값들 중 string_key를 포함하지 않을 경우
			miss_words_n.put(string_key,0);
		else
		//miss_words_q 에서 string_key 값 key 가 존재하면,
	    //miss_words_q 에서 string_key 값을 key로 가진 <key,value> 찾고,
		//value값을 1증가 시켜서 다시 replace 해줌 == 오답 횟수 증가
		for (HashMap.Entry<String, Integer> pair : miss_words_n.entrySet() ) {
			
			String b = pair.getKey();
			if (b.equals(string_key)) {
				
				int new_value = ((int)pair.getValue()) + 1;
				Integer new__value = new_value;
				miss_words_n.put(string_key, new__value);
				
			}
			
			
		}
	
	
	

	    return miss_words_n;
			
				
		
	}

	public HashMap<String,Integer> miss_method1(String string_key, HashMap<String, Integer> miss_words_q) {
		
		//1. 오답단어들의 출제 회수 = question hashmap
		//miss_words_q 에 String자리에는 string_key 값 넣고,
		//Integer 자리에는 1씩 증가된 값 넣기
		int a =1 ;
		if (!( miss_words_q.containsKey(string_key))) //miss_words_q 의 key 값들 중 string_key를 포함하지 않을 경우
			miss_words_q.put(string_key,0);
		else
			//miss_words_q 에서 string_key 값 key 가 존재하면,
		    //miss_words_q 에서 string_key 값을 key로 가진 <key,value> 찾고,
			//value값을 1증가 시켜서 다시 replace 해줌
			for (HashMap.Entry<String, Integer> pair : miss_words_q.entrySet() ) {
				
				String b = pair.getKey();
				if (b.equals(string_key)) {
					
					int new_value =((int)pair.getValue()) + 1;
					Integer new__value = new_value;
					miss_words_q.put(string_key, new__value);
					
				}
				
				
			}
		
		
		
	
		return miss_words_q;
	
		
	}

	public int correctNum(List<Integer> correct) {
		//맞춘 개수 int형으로 반환하는 함수
		
		int correct_num = 0;
		int k = 0;
		Iterator<Integer> it = correct.iterator();
		while(it.hasNext()) {
			if (it.next().equals(1))
				correct_num++;
			else
				k++;
	}
		return correct_num;
	}

	
}
