package com.libery.liberyaplication.mapperDTO;


import com.libery.liberyaplication.model.Autor;
import com.libery.liberyaplication.model.Book;
import com.libery.liberyaplication.model.Person;
import com.libery.liberyaplication.services.AutorService;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BookMapper {


    AutorService autorService;


    public BookMapper(AutorService autorService) {
        this.autorService = autorService;
    }



    public BookResponse cereateResponse(Book book)
    {
        return new BookResponse(book.getIdBook(),book.getBookName(),book.getAuthor());
    }




    public Book createNew  (BookCreateDTO bookDTO)
    {

        Book book = new Book();
        Set<Integer> idSet = bookDTO.getAuthorSet();
        Set<Autor> autorSet = new HashSet<>();


        for(Integer i : idSet)
        {
            autorSet.add(autorService.getAutorById(i));

        }

        book.setBookName(bookDTO.getBookName());
        book.setAuthor(autorSet);

        return book;
    }



}
