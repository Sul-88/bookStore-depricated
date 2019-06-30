package com.sul.bookstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sul.bookstore.domain.Book;
import com.sul.bookstore.service.BookService;

@Controller
public class BookSearchController {

    @Autowired
    public BookService bookService;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchBooks(Model model, HttpServletRequest request) {
        String title = request.getParameter("title");
        // TODO: Use search creteria objects
        List<Book> foundBooks = bookService.findBooks(title);
        model.addAllAttributes(foundBooks);

        return "search";

    }

}
