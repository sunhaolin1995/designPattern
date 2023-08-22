package com.chetuan.iterator;

import java.security.spec.DSAPrivateKeySpec;

/**
 * @author 孙浩林
 * @date: 3/19/23 16:46
 */
public class BookShelf implements Aggregate{

   private Book[] books;

   private int last =0;

   public BookShelf(int maxsize){
       this.books = new Book[maxsize];
   }

   public Book getBookAt(int index){
       return books[index];
   }

   public void appendBook(Book book){
       this.books[last] = book;
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
