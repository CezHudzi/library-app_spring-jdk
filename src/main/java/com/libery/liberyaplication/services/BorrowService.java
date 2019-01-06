package com.libery.liberyaplication.services;


import com.libery.liberyaplication.repo.BookRepositiry;
import com.libery.liberyaplication.repo.BorrowRepository;
import com.libery.liberyaplication.repo.PersonRepository;
import com.libery.liberyaplication.model.Book;
import com.libery.liberyaplication.model.Borrow;
import com.libery.liberyaplication.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class BorrowService {

    private final BookRepositiry bookRepositiry;
    private final PersonRepository personRepository;
    private final BorrowRepository borrowRepository;


    @Autowired
    public BorrowService(BookRepositiry bookRepositiry, PersonRepository personRepository, BorrowRepository borrowRepository) {
        this.bookRepositiry = bookRepositiry;
        this.borrowRepository = borrowRepository;
        this.personRepository = personRepository;
    }




    public void rentBook(Long bookId,Long personId)
    {

        LocalDateTime createdAt = LocalDateTime.now();

        Optional<Book> book = bookRepositiry.findById(bookId);
        Optional<Person> person = personRepository.findById(personId);


        if(book.isPresent())
        {
            if(person.isPresent())
            {
                Borrow temp = new Borrow(createdAt,book.get(),person.get());
                borrowRepository.save(temp);
            }
            else
            {System.out.println("Nie udano dodac");}


        }
        else
        {System.out.println("Nie udano dodac");}




    }


}
