
public class Search_Tree {

	public static void main(String[] args) {
		BinarySearchTree<BinaryNode<Integer>> tree = new BinarySearchTree<BinaryNode<Integer>>();
		BinaryNode<Integer> temp_Node;
		for (int i=1;i<=10000;i++){
			temp_Node = new BinaryNode<Integer>(i);
			tree.insert(temp_Node);
		}
			
	}

}
