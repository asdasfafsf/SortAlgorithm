import java.util.Comparator;

public class InsertSort implements Sort{

	@Override
	public void sortASC(int[] array) {	
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			
			for (int j = i; j > 0; j--) {
				if (key < array[j - 1]) {
					array[j] = array[j - 1];
					array[j - 1] = key;
				}
			}
		}
		
	}


}