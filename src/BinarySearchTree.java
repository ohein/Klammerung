public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

	private BinaryNode<AnyType> root;

	public void insert(AnyType x) {
		root = insert(x, root);
	}

	public void remove(AnyType x) {
		root = remove(x, root);
	}

	public boolean contains(AnyType x) {
		return contains(x, root);
	}

	private boolean contains(AnyType t, BinaryNode<AnyType> n) {

		if (n == null)
			return false;

		int result = t.compareTo(n.data);

		if (result < 0)
			return this.contains(t, n.leftChild);
		else if (result > 0)
			return this.contains(t, n.rightChild);
		else
			return true;
	}

	private BinaryNode<AnyType> insert(AnyType t, BinaryNode<AnyType> n) {
		if (n == null)
			return new BinaryNode<AnyType>(t);

		int result = t.compareTo(n.data);

		if (result < 0)
			n.leftChild = insert(t, n.leftChild);
		else if (result > 0)
			n.rightChild = insert(t, n.rightChild);

		return n;
	}

	private BinaryNode<AnyType> remove(AnyType t, BinaryNode<AnyType> n) {
		if (n == null)
			return n;
		int result = t.compareTo(n.data);
		if (result < 0)
			n.leftChild = remove(t, n.leftChild);
		else if (result > 0)
			n.rightChild = remove(t, n.rightChild);
		else if (n.leftChild != null && n.rightChild != null) {
			n.data = findMin(n.rightChild).data;
			n.rightChild = remove(n.data, n.rightChild);
		} else
			n = (n.leftChild != null) ? n.leftChild : n.rightChild;
		return n;
	}
	
	private BinaryNode<AnyType> findMin(BinaryNode<AnyType> n) {
        if (n==null)
            return null;
        else if (n.leftChild==null)
                return n;
        return findMin(n.leftChild);                
    }
}
