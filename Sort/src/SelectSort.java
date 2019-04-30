import java.util.Comparator;

public class SelectSort<T> implements Sort<T>{

	@Override
	public void sortASC(int[] array) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}
	

	@Override
	public void sortDESC(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}


	@Override
	public void sort(T[] array, Comparator<T> comparator) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				
				if (comparator.compare(array[i], array[j]) == 1) {
					T temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}




}