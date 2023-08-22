package com.chetuan.iterator;


public class IteratorMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("1111"));
        bookShelf.appendBook(new Book("2222"));
        bookShelf.appendBook(new Book("3333"));
        bookShelf.appendBook(new Book("4444"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book next = (Book)iterator.next();
            System.out.println(next.getName());
        }
    }

}
