package word;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VocManager {

	private String userName;
	private Word[] voc = new Word[100]; //객체 배열
	private int number = 0;
	
	static Scanner scan = new Scanner(System.in);

	public VocManager(String userName) {
		super();
		this.userName = userName;
	}
	
	void addWord(Word word) {
		if (number <voc.length) {
			voc[number++] = word; //객체 배열 대입
		}else
			System.out.println("단어장에 더이상의 단어를 등록할 수 없습니다.");
	}
	
	void makeVoc(String fileName) {
		
		try(Scanner scan = new Scanner(new File(fileName))){
			while(scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] temp = str.split("\t");
				this.addWord(new Word(temp[0].trim(),temp[1].trim()));
			}
			System.out.println("단어장이 생성 되었습니다.");
			this.menu();
			
		}catch(FileNotFoundException e) {
			System.out.println(userName+"의 단어장이 생성되지 않았습니다.\n 파일명을 확인해주세요.");
			System.out.println(e.getMessage());
		}
		
	}
	
	void menu() {
		int choice  = 0;
		while(choice != 2) {
			System.out.println("\n----- "+userName+"의 단어장 -----");
			System.out.println("1)단어검색 2)단어검색(2) 3)종료");
			System.out.println("메뉴를 선택하세요 : ");
			choice = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			switch(choice) {
			case 1:
				searchVoc();
				break;
			case 2:
				searchVoc2();
			case 3:
				System.out.println(userName + "의 단어장 프로그램을 종료합니다.");
				break;
			}
		}
	}

	public void searchVoc2() {
		// TODO Auto-generated method stub
		System.out.println("===== 단어검색2 ====");
		System.out.print("검색할 단어를 입력하세요 : ");
		String sWord = scan.nextLine();	
		sWord = sWord.trim();
		for(Word word : voc) {
			if (word != null) {
				if(word.eng.contains(sWord)) {
					System.out.println("단어의 뜻 : "+word.kor);

				}
			}else {
				//System.out.println("찾으시는 단어가 없습니다.");
				break;
			}
			
		}
	}
		
	

	public void searchVoc() {
		// TODO Auto-generated method stub
		System.out.println("===== 단어검색 ====");
		System.out.print("검색할 단어를 입력하세요 : ");
		String sWord = scan.nextLine();	
		sWord = sWord.trim();
		for(Word word : voc) {
			if (word != null) {
				if(word.eng.equals(sWord)) {
					System.out.println("단어의 뜻 : "+word.kor);
					break;
				}
			}else {
				System.out.println("찾으시는 단어가 없습니다.");
				break;
			}
			
		}
	}
	
}
