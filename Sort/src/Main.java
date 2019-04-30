
public class Main {
	public static void main(String args[]) {
		Sort sort = new MergeSort();
		int[] a = {5,4,3,2, 1};
		
		sort.sortASC(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	
}
