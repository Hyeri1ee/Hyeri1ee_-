package collections;

public class Test1 <E>{
	
	private int capacity;
	private int count =0;
	private E[] arr;
	

	@SuppressWarnings("unchecked")
	public Test1(int capacity) {
		this.capacity = capacity;
		this.arr = (E[]) new Object[this.capacity]; //E타입의 []배열 생성
	}

	public void add(E data) {
		if (this.count <this.capacity)
			this.arr[count++]= data; //E타입의 data arr배열에 대입
		else
			System.out.println("공간부족");
	}
	
	public E getElement(int index) {
		if (index >= 0 && index <count)
			return this.arr[index];
		else
			return null;
	}
}
