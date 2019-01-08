package com.libery.liberyaplication.services;


import com.libery.liberyaplication.mapperDTO.BookCreateDTO;
import com.libery.liberyaplication.mapperDTO.BookMapper;
import com.libery.liberyaplication.mapperDTO.BookResponse;
import com.libery.liberyaplication.repo.BookRepositiry;
import com.libery.liberyaplication.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepositiry bookRepositiry;
    private final BookMapper bookMapper;

    @Autowired
    public BookService(BookRepositiry bookRepositiry, BookMapper bookMapper)
    {
        this.bookRepositiry = bookRepositiry;
        this.bookMapper=bookMapper;
    }




    public void addBook(BookCreateDTO bookDTO) {
        bookRepositiry.save(bookMapper.createNew(bookDTO));
    }


    public List<BookResponse> getAllBookServ() {

    return bookRepositiry.findAll().stream().map(bookMapper::cereateResponse).collect(Collectors.toList());

    }
}
