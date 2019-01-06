package com.libery.liberyaplication.mapperDTO;


import com.libery.liberyaplication.services.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    private BookService bookService;


    public BookMapper(BookService bookService) {
        this.bookService = bookService;
    }










}
