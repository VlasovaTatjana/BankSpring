package com.example.demo.configuration;

import com.example.demo.core.Bank;
import com.example.demo.repository.BankRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(BankRepository bankRepository) {
        return args -> {
            Bank tatjana = new Bank("Tatjana", "Vlasova", 50.0);
            Bank paula = new Bank("Paula", "Merle", 40.0);
            Bank anastasija = new Bank("Anastasija", "Poke", 70.0);
            bankRepository.save(tatjana);
            bankRepository.save(paula);
            bankRepository.save(anastasija);
        };
    }


}
