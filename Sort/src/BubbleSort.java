import java.util.Comparator;

public class BubbleSort implements Sort{
	
	
	public void sortASC(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				
				if (array[j + 1] < array[j] ) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
			}
		}
	}
	

}