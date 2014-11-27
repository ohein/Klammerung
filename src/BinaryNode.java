class BinaryNode <AnyType extends Comparable <? super AnyType>> {
	AnyType data;
	BinaryNode<AnyType> leftChild;
	BinaryNode<AnyType> rightChild;	
	
	public <AnyType extends Comparable <? super AnyType>> BinaryNode (AnyType data1) {
		this.data=data1;
	}
}
