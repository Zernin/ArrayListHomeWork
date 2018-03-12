
public class Array<E> {

	private E[] array;
	private static final int INITIAL = 10;
	private int size;
	
	public Array() {
		array = (E[]) new Object[INITIAL];
		size = 0;		
	}
	
	public void add(E e) {
		if (size == array.length)
			return;
		array[size] = e;			
	}
	
	public void removeInstances(E e) {
		int countInstance = 0;
		
		for (int i = 0 ; i < size ; i++)
			if(array[i] == e) {
				array[i] = null;
				countInstance++;
			}	
		size =- countInstance;
	}
	
	public String size(){
		return ""+ size;
				
	}
}
