package com.sul.bookstore.service;

import javax.naming.AuthenticationException;

import com.sul.bookstore.domain.Account;
import com.sul.bookstore.domain.Address;
import com.sul.bookstore.exception.RegistrationException;

public interface AccountService {

    Account findAccount(String username);

    Account login(String username, String password) throws AuthenticationException;

    void register(String firstname, String lastname, String username, String password, String email, Address address)
            throws RegistrationException;

}
