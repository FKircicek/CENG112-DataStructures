import java.util.EmptyStackException;

public class PriorityQueue<T> extends AListComputation<T> {

    private Computation computation;
    private T[] PrioQueue;
    private int frontIndex;
    private int numOfEntries;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public PriorityQueue(){
        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Computation[DEFAULT_CAPACITY];
        frontIndex = 0;
        PrioQueue = tempList;
        numOfEntries = 0;
        initialized = true;
    }
    private void checkInitialization(){
        if (!initialized){
            throw new SecurityException("List is not initalized properly!");
        }
    }

    @Override
    public void add(T newEntry) {
        super.add(newEntry);
    }
    public T remove() {
        return super.remove(1);
    }

    @Override
    public T[] toArray() {
        return super.toArray();
    }


    public T peek() {
        return super.getEntry(1);
    }
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }


    public int getSize() {
        return super.getLength();
    }

    public void clear(){
        final  int a = getSize();
        for(int i = 0; i < a; i++){
            remove();
        }
    }
}
