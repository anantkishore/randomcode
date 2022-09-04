package com.kishore.anant.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator {
    public static void main(String[] args) {

    }
}

class PeekingIteratorImplementation  implements Iterator<Integer> {

    private List<Integer> list = new ArrayList<>();
    private int cursor = 0;
    public PeekingIteratorImplementation(Iterator<Integer> iterator) {
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (cursor < list.size())
            list.get(cursor+1);
        return null;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(cursor < list.size())
            return list.get(cursor++);
        // written this to pass the compilation error
        return 0;
    }

    @Override
    public boolean hasNext() {
        if(cursor < list.size())
            return true;
        return false;
    }
}
