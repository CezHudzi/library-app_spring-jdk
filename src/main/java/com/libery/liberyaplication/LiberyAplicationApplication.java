package com.libery.liberyaplication;


//TODO ERROR ADD
//TODO BOOK MAP
//TODO REMOVE AND SELECT SOMETHING


import com.libery.liberyaplication.mapperDTO.AutorCreateDTO;
import com.libery.liberyaplication.mapperDTO.BookCreateDTO;
import com.libery.liberyaplication.mapperDTO.PersonCreateDTO;
import com.libery.liberyaplication.services.AutorService;
import com.libery.liberyaplication.services.BookService;
import com.libery.liberyaplication.services.BorrowService;
import com.libery.liberyaplication.services.PersonService;
import com.libery.liberyaplication.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class LiberyAplicationApplication implements CommandLineRunner {

	private final BookService bookService;
	private final PersonService personService;
	private final BorrowService borrowService;
	private final AutorService autorService;

	@Autowired
	public LiberyAplicationApplication(BookService bookService, PersonService personService, BorrowService borrowService, AutorService autorService) {
		this.bookService = bookService;
		this.personService = personService;
		this.borrowService = borrowService;
		this.autorService = autorService;
	}



	public static void main(String[] args) {
		SpringApplication.run(LiberyAplicationApplication.class, args);








	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {


		AutorCreateDTO autorOne = new AutorCreateDTO("Adam", "Mickiewicz");
		AutorCreateDTO autorTwo = new AutorCreateDTO("Juliusz", "Słowacki");
		AutorCreateDTO autorThree = new AutorCreateDTO("Sigmunt", "Froud");

		autorService.addAutor(autorOne);
		autorService.addAutor(autorTwo);
		autorService.addAutor(autorThree);

		Set<Integer> autorsFirst = new HashSet<Integer>();
		Set<Integer> autorsSecond = new HashSet<Integer>();

		autorsFirst.add(1);
		autorsFirst.add(3);
		autorsSecond.add(2);


		BookCreateDTO one =  new BookCreateDTO("DZIADY", autorsFirst);
		BookCreateDTO two =  new BookCreateDTO("Dziady", autorsFirst);
		BookCreateDTO three =  new BookCreateDTO("Historia Rzymu", autorsSecond);
		BookCreateDTO four =  new BookCreateDTO("Harry Potter", autorsSecond);
		BookCreateDTO five =  new BookCreateDTO("Pachnidlo", autorsFirst);

		bookService.addBook(one);
		bookService.addBook(two);
		bookService.addBook(three);
		bookService.addBook(four);
		bookService.addBook(five);

		PersonCreateDTO oneP = new PersonCreateDTO("IZ" , "Vo");
        PersonCreateDTO twoP = new PersonCreateDTO("Pawel", "Dem");
        PersonCreateDTO threeP = new PersonCreateDTO("Adam", "Maklowicz");
        PersonCreateDTO fourP = new PersonCreateDTO("Maciek", "Kur");
        PersonCreateDTO fiveP = new PersonCreateDTO("Asia", "Zag");

		personService.addPerson(oneP);
		personService.addPerson(twoP);
		personService.addPerson(threeP);
		personService.addPerson(fourP);
		personService.addPerson(fiveP);

		//borrowService.rentBook(1L,2L);
		//borrowService.rentBook(3L,2L);
		//borrowService.rentBook(3L,2L);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------STARTED----------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}
}

