package com.libery.liberyaplication.mapperDTO;


import com.libery.liberyaplication.model.Autor;
import org.hibernate.mapping.Index;

import java.util.Set;

public class BookCreateDTO {



    private String bookName;
    private Set<Integer> author;

    public BookCreateDTO(String bookName, Set<Integer> author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }


    public Set<Integer> getAuthorSet() {
        return author;
    }
}

