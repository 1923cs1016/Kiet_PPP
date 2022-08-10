// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr = null;
    Integer val = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    itr = iterator;
        if(itr.hasNext()) val = itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return val;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer val1 = val;
        if(itr.hasNext())
            val = itr.next();
        else 
            val = null;
        return val1;
	}
	
	@Override
	public boolean hasNext() {
	     return val != null || itr.hasNext();
	}
}
