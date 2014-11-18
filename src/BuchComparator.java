import java.util.*;

public class BuchComparator implements Comparator<Buch> {
	public int compare(Buch a, Buch b) {
		int d;
		d = a.getISBN() - b.getISBN();
		if (d < 0)
			return -1;
		else
			if (d > 0)
				return 1;
			else
				return 0;
	}
}
