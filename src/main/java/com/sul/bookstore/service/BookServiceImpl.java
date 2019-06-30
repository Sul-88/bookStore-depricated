package com.sul.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sul.bookstore.domain.Book;
import com.sul.bookstore.repository.BookRepository;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    public BookRepository bookRepository;

    @Override
    public List<Book> findBooks(String title) {
        List<Book> books = bookRepository.findByTitle(title);

        return books;
    }

}
