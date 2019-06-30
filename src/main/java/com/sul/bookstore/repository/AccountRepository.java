package com.sul.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sul.bookstore.domain.Account;

@Repository("accountRepository")
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByUsername(String username);

    // Account saveAccount(Account account);

}
