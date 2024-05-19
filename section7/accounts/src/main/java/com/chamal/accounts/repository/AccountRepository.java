package com.chamal.accounts.repository;

import com.chamal.accounts.entity.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByCustomerId(Long customerId);

    Optional<Account> findByAccountNumber(Long accountNumber);
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
