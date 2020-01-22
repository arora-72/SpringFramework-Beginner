package com.daoBook.dao;

import com.daoBook.model.Book;

import java.util.List;

public interface BookDao {

    List<Book> getAllBooks();
    Book getBookByISBN(int isbn);
    void saveBook(Book book);
    void deleteBook(Book book);

}
