package com.sul.bookstore.service;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sul.bookstore.domain.Account;
import com.sul.bookstore.domain.Address;
import com.sul.bookstore.exception.RegistrationException;
import com.sul.bookstore.repository.AccountRepository;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account findAccount(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public Account login(String username, String password) throws AuthenticationException {

        Account account = accountRepository.findByUsername(username);
        if (account == null) {
            throw new AuthenticationException("wrong username and password combination");
        }

        // TODO: check the password
        return account;
    }

    @Override
    public void register(String firstname, String lastname, String username, String password, String email, Address address)
            throws RegistrationException {
        Account account = accountRepository.findByUsername(username);
        if (account != null) {
            throw new RegistrationException("There is an account with the username:" + username);
        }
        account = new Account();
        account.setFirstName(firstname);
        account.setLastName(lastname);
        account.setUsername(username);
        account.setPassword(password);
        account.setEmailAddress(email);
        accountRepository.save(account);

        // TODO Auto-generated method stub

    }

}
