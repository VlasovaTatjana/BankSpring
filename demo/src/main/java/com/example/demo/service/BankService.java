package com.example.demo.service;

import com.example.demo.core.Bank;
import com.example.demo.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankService {
    private final BankRepository bankRepository;

    @Autowired
    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }


    public Bank getBankById(Long accountId) {
        Optional<Bank> byId = bankRepository.findById(accountId);
        return byId.get();
    }

}
