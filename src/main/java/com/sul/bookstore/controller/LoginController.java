package com.sul.bookstore.controller;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sul.bookstore.domain.Account;
import com.sul.bookstore.service.AccountService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    public static final String ACCOUNT_ATTRIBUTE = "account";

    @Autowired
    AccountService accountService;

    public LoginController() {}

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handleLogin(HttpServletRequest request, HttpSession session) {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Account account = accountService.login(username, password);
            session.setAttribute("account", account);
            return "redirect:/index";
        } catch (AuthenticationException e) {
            request.setAttribute("exception", e);
            return "login";
        }

    }

}
