package com.libery.liberyaplication.controller;


import com.libery.liberyaplication.mapperDTO.BookCreateDTO;
import com.libery.liberyaplication.mapperDTO.BookResponse;
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
    public List<BookResponse> getAllPerson()
    {
        return bookService.getAllBookServ();
    }


    @PostMapping
    public void addBook(@RequestBody BookCreateDTO bookDTO) {
        bookService.addBook(bookDTO);
    }



}
