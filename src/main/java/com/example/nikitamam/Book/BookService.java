package com.example.nikitamam.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    private final  BookRepository bookRepository;
    @Autowired
    BookService(BookRepository  bookRepository){
        this.bookRepository = bookRepository;
    }
    public List<Book> getbook(){
        return  bookRepository.findAll();
    }
}
