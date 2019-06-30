package com.sul.bookstore.service;

import java.util.List;

import com.sul.bookstore.domain.Book;

public interface BookService {

    public List<Book> findBooks(String title);
}
