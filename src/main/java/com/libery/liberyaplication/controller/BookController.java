package com.libery.liberyaplication.controller;


import com.libery.liberyaplication.model.Book;
import com.libery.liberyaplication.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }



    @GetMapping
    public List<Book> getAllPerson()
    {
        return bookService.getAllBookServ();
    }


    @PostMapping
    public void addPerson(@RequestBody Book book) {
        bookService.addBook(book);
    }



}
