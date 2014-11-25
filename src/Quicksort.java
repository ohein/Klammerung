public class Quicksort {

	public static void quicksort(int[] a, int von, int bis) {
		int v = a[(bis + von) / 2];
		int i = von, j = bis;
		do {
			while (a[i] < v)
				i++;
			while (a[j] > v)
				j--;
			if (i <= j)
				swap(a, i++, j--);
		} while (i <= j);
		if (von < j)
			quicksort(a, von, j);
		if (bis > i)
			quicksort(a, i, bis);
	}
	
	private static void swap(int[] a,int pos1,int pos2) {
		int hlp=a[pos1];
		a[pos1]=a[pos2];
		a[pos2]=hlp;
	}
}
