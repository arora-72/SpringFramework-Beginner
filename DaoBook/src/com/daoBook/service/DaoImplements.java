package com.daoBook.service;

import com.daoBook.dao.BookDao;
import com.daoBook.model.Book;

import java.util.ArrayList;
import java.util.List;

public class DaoImplements implements BookDao {

    private List<Book> books;

    public DaoImplements (){
        books = new ArrayList<Book>();
        books.add(new Book(1243, "kakashi"));
        books.add(new Book(2389, "takamura"));
        books.add(new Book(1028, "shinigami"));
        books.add(new Book(9089, "tokua"));
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookByISBN(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }
}
