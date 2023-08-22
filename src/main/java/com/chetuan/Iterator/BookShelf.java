package com.chetuan.Iterator;

import java.util.ArrayList;

/**
 * @author 孙浩林
 * @date: 3/19/23 16:46
 */
public class BookShelf implements Aggregate{

   private  ArrayList<Book> books;

   private int last =0;

   public BookShelf(int maxsize){
       this.books = new ArrayList<>(maxsize);
   }

   public Book getBookAt(int index){
       return books.get(index);
   }

   public void appendBook(Book book){
       this.books.add(book);
       last++;
   }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public int getLength() {
       return last;
    }
}
