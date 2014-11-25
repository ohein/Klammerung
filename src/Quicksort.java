public class Quicksort {

	public static void main(String[] args) {
		int[] zahlen = {5, 8, 2, 3, 1, 9, 4, 7, 10, 6};
		quicksort(zahlen, 0, 9);
		ausgabe(zahlen, 0, 9);
	}
	
	public static void quicksort(int[] a, int von, int bis) {
		ausgabe(a, von, bis);
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
	
	private static void ausgabe(int[] a, int b, int e){
		for (int i=b; i<=e; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
