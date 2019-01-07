package com.libery.liberyaplication;


//TODO ERROR ADD
//TODO BOOK MAP
//TODO REMOVE AND SELECT SOMETHING


import com.libery.liberyaplication.mapperDTO.PersonCreateDTO;
import com.libery.liberyaplication.services.BookService;
import com.libery.liberyaplication.services.BorrowService;
import com.libery.liberyaplication.services.PersonService;
import com.libery.liberyaplication.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LiberyAplicationApplication implements CommandLineRunner {

	private final BookService bookService;
	private final PersonService personService;
	private final BorrowService borrowService;

	@Autowired
	public LiberyAplicationApplication(BookService bookService, PersonService personService, BorrowService borrowService) {
		this.bookService = bookService;
		this.personService = personService;
		this.borrowService = borrowService;
	}



	public static void main(String[] args) {
		SpringApplication.run(LiberyAplicationApplication.class, args);








	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Book one =  new Book("Qwo Wadis","Henryk Sienkiewicz");
		Book two =  new Book("Dziady","Adam Mickiewicz");
		Book three =  new Book("Historia Rzymu","Karwa Dwa");
		Book four =  new Book("Harry Potter","Jay Rowlling");
		Book five =  new Book("Pachnidlo","Iwan Grozny");

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

		borrowService.rentBook(1L,2L);
		borrowService.rentBook(3L,2L);
		borrowService.rentBook(3L,2L);

        System.out.println("-------------------------------------");
		System.out.println("--------------START------------------");
        System.out.println("-------------------------------------");
	}
}

