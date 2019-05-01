
public class Main {
	public static void main(String args[]) {
		Sort sort = new QuickSort();
		int[] a = new int[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 999);
		}
		
		sort.sortASC(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
	
}
