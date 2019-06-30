package com.sul.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    public IndexController() {}

    @RequestMapping(value = { "", "/index", "/home" }, method = RequestMethod.GET)
    public ModelAndView indexPage() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.getModelMap().addAttribute("message", "message from index controller");
        return new ModelAndView("index");
    }

    // @RequestMapping(value = "/loginPage", method = RequestMethod.POST)
    // public String handleLogin(HttpServletRequest request, HttpSession session) {
    // return "login";
    // }

}
