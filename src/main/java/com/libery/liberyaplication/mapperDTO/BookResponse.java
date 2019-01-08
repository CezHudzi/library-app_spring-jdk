package com.libery.liberyaplication.mapperDTO;

import com.libery.liberyaplication.model.Autor;

import java.util.Set;

public class BookResponse {




    private final long bookId;
    private final String bookName;
    private final Set<Autor> autorList;


    public long getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Set<Autor> getAutorList() {
        return autorList;
    }

    BookResponse(long bookId, String bookName, Set<Autor> autorList) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.autorList = autorList;
    }
}
