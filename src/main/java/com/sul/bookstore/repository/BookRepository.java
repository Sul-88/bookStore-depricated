package com.sul.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sul.bookstore.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    public List<Book> findByTitle(String title);

}
