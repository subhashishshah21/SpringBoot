package com.example.nikitamam.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BookConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository){
        return args -> {
            Book HP = new Book(1,"Harry Potter","J.K rowling",800.0,"harry");
            bookRepository.saveAll(Arrays.asList(HP));
        };
    }
}
