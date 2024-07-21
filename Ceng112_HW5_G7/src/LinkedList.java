public class LinkedList<T> {
    private Node firstNode;
    private int numberOfEntries;

    LinkedList() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        if(isEmpty() ) {
            firstNode = newNode;
        }else {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.setNext(newNode);
        }
        numberOfEntries++;

    }
    public int getLength() {
        return numberOfEntries;
    }

    public T getEntry(int position) {
        Node node = getNodeAt(position);
        T result = node.getData();
        return result;
    }

    private Node getNodeAt(int givenPosition) {
        assert (firstNode != null) && (givenPosition <= numberOfEntries);
        Node currentNode = firstNode;
        for(int counter = 1; counter < givenPosition; counter++) {
            currentNode = currentNode.getNext();
        }
        assert currentNode != null;

        return currentNode;
    }

    public boolean isEmpty() {
        boolean result;
        if(numberOfEntries == 0) {
            assert firstNode == null;
            result = true;
        }else {
            assert firstNode != null;
            result = false;
        }
        return result;
    }
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this(data,null);
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }



        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }



        public void setData(T data) {
            this.data = data;
        }

    }

}