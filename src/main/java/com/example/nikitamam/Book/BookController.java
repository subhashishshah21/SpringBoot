package com.example.nikitamam.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/book")
public class BookController {
    private final BookService bookService;

//    This is used for dependency injection
    @Autowired
    public BookController(BookService bookService){
       this.bookService = bookService;
   }
    @GetMapping
    public List<Book> getBookService(){
       return bookService.getbook();
   }

}
