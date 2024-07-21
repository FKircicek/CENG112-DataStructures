public class Tree<T extends Comparable<? super T> & Nameable> {
    private BinaryNode<T> root;

    public Tree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public T insert(T newEntry) {
        T result = null;
        if (isEmpty()) {
            root = new BinaryNode<>(newEntry);
        } else {
            result = insertRec(root, newEntry);
        }
        return result;
    }

    private T insertRec(BinaryNode<T> rootNode, T newEntry) {
        T result = null;
        int comparison = newEntry.compareTo(rootNode.getValue());
        if (comparison == 0) {
            result = rootNode.getValue();
            rootNode.value = newEntry;
        } else if (comparison < 0) {
            if (rootNode.hasLeftChild()) {
                result = insertRec(rootNode.getLeftChild(), newEntry);
            } else {
                rootNode.left = new BinaryNode<>(newEntry);
            }
        } else {
            if (rootNode.hasRightChild()) {
                result = insertRec(rootNode.getRightChild(), newEntry);
            } else {
                rootNode.right = new BinaryNode<>(newEntry);
            }
        }
        return result;
    }

    public T getEntry(T entry) {
        return findEntry(root, entry);
    }

    private T findEntry(BinaryNode<T> rootNode, T entry) {
        T result = null;
        if (rootNode != null) {
            T rootEntry = rootNode.getValue();
            if (entry.equals(rootEntry)) {
                result = rootEntry;
            } else if (entry.compareTo(rootEntry) < 0) {
                result = findEntry(rootNode.getLeftChild(), entry);
            } else {
                result = findEntry(rootNode.getRightChild(), entry);
            }
        }
        return result;
    }

    public T findByName(String name) {
        return findByNameRec(root, name);
    }

    private T findByNameRec(BinaryNode<T> rootNode, String name) {
        if (rootNode == null) {
            return null;
        }

        if (rootNode.getValue().getName().equals(name)) {
            return rootNode.getValue();
        }

        T leftResult = findByNameRec(rootNode.getLeftChild(), name);
        if (leftResult != null) {
            return leftResult;
        }

        return findByNameRec(rootNode.getRightChild(), name);
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(BinaryNode<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    private static class BinaryNode<T> {
        private T value;
        private BinaryNode<T> left;
        private BinaryNode<T> right;

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
}
