package com.libery.liberyaplication.services;


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

    @Autowired
    public BookService(BookRepositiry bookRepositiry) {
        this.bookRepositiry = bookRepositiry;
    }




    public void addBook(Book book) {
        bookRepositiry.save(book);
    }


    public List<Book> getAllBookServ() {

    return new ArrayList<>(bookRepositiry.findAll());

    }
}
