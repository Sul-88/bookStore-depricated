package com.sul.bookstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sul.bookstore.domain.Address;
import com.sul.bookstore.exception.RegistrationException;
import com.sul.bookstore.service.AccountService;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView register() {
        return new ModelAndView("register");
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handleRegister(HttpServletRequest request, HttpSession session) {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String email = request.getParameter("email");
            Address address = new Address();
            accountService.register(firstname, lastname, username, password, email, address);
            return "redirect:/login";
        } catch (RegistrationException e) {
            request.setAttribute("exception", e);
            return "login";
        }

    }

}
