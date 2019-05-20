import java.util.Comparator;

public class QuickSort implements Sort {


	@Override
	public void sortASC(int[] array) {
		// TODO Auto-generated method stub
		
		divide(array, 0, array.length - 1);

	}

	private void divide(int[] array, int left, int right) { // 피벗을 맨 끝으로 두고 했을 때.
		int start = left;
		int end = right - 1;
		
		
		do {
			while(start < right && array[start] < array[right]) {
				start++;
			}
			
			while(end > left && array[end] >= array[right]) {
				end--;
			}
			
			if (start < end) {
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
		} while (start < end);
			
		int temp = array[right];
		array[right] = array[start];
		array[start] = temp;
		
		if (left < start - 1) {
			divide(array, left, start - 1);
		}
		
		if (start + 1 < right) {
			divide(array, start + 1, right);
		}


	}


}
