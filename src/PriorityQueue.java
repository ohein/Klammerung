import java.util.*;

public class PriorityQueue {

	private ArrayList<Integer> array = new ArrayList<Integer>();

	public void insert(int x) {
		array.add(x);
		upHeap(array.size());
	}

	private void upHeap(int hole) {
		while (hole > 1 && array.get(hole).compareTo(array.get(hole/2)) < 0) {
			swap(hole, hole / 2);
			hole /= 2;
		}
	}

	private void swap(int pos1, int pos2) {
		int hlp = array.get(pos1);
		array.set(pos1, array.get(pos2));
		array.set(pos2, hlp);
	}

	public int deleteMin() {
		int minItem = array.get(1);
		array.set(1, array.get(array.size()));
		array.remove(array.size());
		downHeap(1);
		return minItem;
	}

	private void downHeap(int hole) {
		int child;
		int tmp = array.get(hole);
		while (hole * 2 <= array.size()) {
			child = hole * 2;
			if (child != array.size() && array.get(child + 1).compareTo(array.get(child)) < 0)
				child++;
			if (array.get(child).compareTo(tmp) < 0)
				array.set(hole, array.get(child));
			else
				break;
			hole = child;
		}
		array.set(hole, tmp);
	}
}
