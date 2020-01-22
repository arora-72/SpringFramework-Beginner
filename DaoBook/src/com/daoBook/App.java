package com.daoBook;

import com.daoBook.dao.BookDao;
import com.daoBook.model.Book;
import com.daoBook.service.DaoImplements;

public class App {
    public static void main(String[] args) {
        BookDao bookDao = new DaoImplements();

        for(Book book: bookDao.getAllBooks()){
            System.out.println("Book ISBN  " + book.getIsbn() + " Book name " + book.getBookName());
        }

        //update book
        Book book = bookDao.getAllBooks().get(1);
        book.setBookName("sakns");
        bookDao.saveBook(book);
    }
}
