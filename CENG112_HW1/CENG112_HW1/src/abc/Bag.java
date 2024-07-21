package abc;

import java.util.Arrays;

public class Bag<T> implements IBag<T>{
	
	private T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 25;
	private boolean initialized = false;
	private static final int MAX_CAPACITY = 10000;
	
	

	public Bag() {
		this(DEFAULT_CAPACITY);
	}
	
	public Bag(int capacity) {
		if(capacity<=MAX_CAPACITY) {
			@SuppressWarnings("unchecked")
			T[] tempBag = (T[]) new Object[capacity];
			bag = tempBag;
			numberOfEntries = 0;
			initialized = true;
			
		}
		else {
			throw new IllegalStateException("Attempt to create a bag");
		}
	}
	
	
	@Override
	public boolean add(T newEntry) {
		checkInitilization();
		
		if(isFull()) {
			doubleCapacity();
		}
			bag[numberOfEntries] = newEntry;
			numberOfEntries++;
		
		return true;
	}

	@Override
	public boolean isEmpty() {
		
		return numberOfEntries == 0;
	}

	@Override
	public boolean isFull() {
		
		return numberOfEntries >= bag.length;
	}

	@Override
	public T removeByIndex(int index) {
		
		return null;
	}
	
	@Override
	public boolean remove(T anEntry) {
		checkInitilization();
		int index = getIndexOf(anEntry);
		T result = removeEntry(index);
		return anEntry.equals(result);
	}

	@Override
	public T remove() {
		checkInitilization();
		T result = null;
		if (numberOfEntries>0) {
			result = bag[numberOfEntries -1];
			bag[numberOfEntries-1] = null;
			numberOfEntries--;
		}
		return result;
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		checkInitilization();
		int counter = 0;
		for (int i = 0; i < numberOfEntries; i++) {
			if(anEntry.equals(bag[i])) {
				counter++;
			}
		}
		return counter;
	}

	@Override
	public int getIndexOf(T anEntry) {
		int where = -1;
		boolean found = false;
		int index = 0;
		while (!found && (index<numberOfEntries)) {
			if(anEntry.equals(bag[index])) {
				where = index;
				found = true;
			}
			index ++;
		}
		return where;
	}

	@Override
	public boolean contains(T anEntry) {
		checkInitilization();
		return getIndexOf(anEntry)>-1;
	}

	@Override
	public void clear() {
		while(!isEmpty()) {
			remove();
		}
		
	}

	@Override
	public void displayItems() {
		System.out.println("Total Number of Entries : " + numberOfEntries);
		for(int i=0; i<numberOfEntries;i++) {
			System.out.println("Element "+(i+1)+": "+bag[i]);
		}
		
	}

	@Override
	public int getCurrentSize() {
		
		return numberOfEntries;
	}

	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[])new Object[numberOfEntries];
		for(int i = 0; i<numberOfEntries;i++) {
			result[i] = bag[i];
		}
		return result;
	}
		
	private void checkInitilization() 
	{
		if(!initialized) {
			throw new SecurityException("Bag object isnot initialized "+ "properly");
		}
		
	}
	private T removeEntry(int index) {
		T result = null;
		if(!isEmpty()&&(index>=0)) {
			result = bag[index];
			bag[index] = bag[numberOfEntries-1];
			
			bag[numberOfEntries] = null;
			numberOfEntries--;
			
		}
		
		return result;
	}
	private void doubleCapacity() {
		checkCapacity(2*bag.length);
		bag = Arrays.copyOf(bag, 2*bag.length);
		
		
	}

	private void checkCapacity(int capacity) {
		if(capacity>MAX_CAPACITY) {
			throw new SecurityException("Bag object isnot initialized "+ "properly");
		}
		
	}

}
