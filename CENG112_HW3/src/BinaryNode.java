class BinaryNode<T> {
    T value;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return value;
    }

    public BinaryNode<T> getLeftChild() {
        return left;
    }

    public BinaryNode<T> getRightChild() {
        return right;
    }
    public boolean hasLeftChild() {
        return left != null;
    }

    public boolean hasRightChild() {
        return right != null;
    }
}