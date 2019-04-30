import java.util.Comparator;

public interface Sort<T> {	
	public void sort(T[] array, Comparator<T> comparator);
	public void sortASC(int[] array);
	public void sortDESC(int[] array);
}