package com.example.demo.controller;

import com.example.demo.core.Bank;
import com.example.demo.repository.BankRepository;
import com.example.demo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Bank/")
public class BankController {


    private final BankRepository bankRepository;
    private final BankService bankService;

    @Autowired
    public BankController(BankRepository bankRepository, BankService bankService) {
        this.bankRepository = bankRepository;
        this.bankService = bankService;
    }

    @GetMapping()
    public Bank getBank(@RequestParam Long accountId) {
        return bankService.getBankById(accountId);
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }


}
