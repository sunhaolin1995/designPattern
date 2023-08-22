package com.chetuan.Iterator;


public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;

    private int index ;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (index >= bookShelf.getLength()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
