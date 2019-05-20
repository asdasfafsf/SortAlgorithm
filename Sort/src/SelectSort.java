import java.util.Comparator;

public class SelectSort implements Sort{

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
	

}