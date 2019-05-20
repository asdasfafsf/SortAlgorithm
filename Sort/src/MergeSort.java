import java.util.Comparator;

public class MergeSort implements Sort {
	private int[] dummy;
	
	@Override
	public void sortASC(int[] array) {
		dummy = new int[array.length];
		// TODO Auto-generated method stub
		mergeSort(array, 0, array.length);
		
		dummy = null;
	}
	
	private void merge(int[] array, int start, int end) {
		int middle = (end + start) / 2;
		
		System.out.println("ÇÕÃ¼ : " + start + "  " + middle + "  "  + end);
		
		int leftIndex = start;
		int rightIndex = middle;
		int index = 0;
		
		while (leftIndex < middle && rightIndex < end) {
			if (array[leftIndex] <= array[rightIndex]) {
				dummy[start + index] = array[leftIndex++];
			} else {
				dummy[start + index] = array[rightIndex++];
			}
			index++;
		}
		
		while (leftIndex < middle) {
			dummy[start + index] = array[rightIndex++];
			index++;
		}
	
		while (rightIndex < end) {
			dummy[start + index] = array[rightIndex++];
			index++;
		}
		
		
		for (int i = start; i < end; i++) {
			array[i] = dummy[i];
		}

	}
	
	
	private void mergeSort(int[] array, int start, int end) {
		if (start + 1 < end) {
			mergeSort(array, start, (start + end) / 2);
			mergeSort(array, (start + end) / 2, end);
			merge(array, start, end);
		}
	}

	

}