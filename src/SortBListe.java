import java.util.*;

public class SortBListe {

	public static void main(String[] args) {
		
		List<Buch> bliste = new LinkedList<Buch>();
		int i,j;
		
		bliste.add(new Buch("Thomas Mann", "Der Zauberberg", 3));
		bliste.add(new Buch("Max Frisch", "Homo Faber", 5));
		bliste.add(new Buch("Emile Zola", "Germinal", 4));
		bliste.add(new Buch("Lev Tolstoi", "Anna Karenina", 1));
		
		BuchComparator bcomp = new BuchComparator();
		ListIterator<Buch> listIterator = bliste.listIterator();
		ListIterator<Buch> listIterator2 = bliste.listIterator();
		
		while (listIterator.hasNext()){  // Ausgabe der Liste vor Sortierung
			Buch t;
			t=listIterator.next();
			System.out.print(t.getAutor() + "  ");
			System.out.print(t.getTitel() + "  ");
			System.out.println(t.getISBN());
		}
		System.out.println(" ");
		
		boolean isSorted;
		Buch t1, t2;
		i=0;
		j=1;
		listIterator = bliste.listIterator();  // Iterator initialisieren
		
		
		while (listIterator.hasNext()){  // Sortierung nach BubbleSort
			isSorted = true;
			t1=listIterator.next();
			listIterator2 = bliste.listIterator(j); // Iterator2 initialisieren
			while (listIterator2.hasNext()){
				t2 = listIterator2.next();
				if (bcomp.compare(t1, t2) < 0){
					Collections.swap(bliste,i,j);
					isSorted=false;
				}
				j=j+1;
			}
			if (isSorted) break;
			i=i+1;
		}	
		
		listIterator = bliste.listIterator(); // Iterator initialisieren
		
		while (listIterator.hasNext()){  // Ausgabe der Liste nach Sortierung
			Buch t;
			t=listIterator.next();
			System.out.print(t.getAutor() + "  ");
			System.out.print(t.getTitel() + "  ");
			System.out.println(t.getISBN());
		}
	}
}
