package com.libery.liberyaplication.model;


import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "books")
public class Book {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;

    private String bookName;
    private String bookAutor;

    public Book(String bookName, String bookAutor) {
        this.bookName = bookName;
        this.bookAutor = bookAutor;
    }

    public Book() {
    }

    @OneToMany (mappedBy = "book")
    private Set<Borrow> borrow;



    @ManyToMany
    @JoinTable(
            name = "authors_book",
            joinColumns = {@JoinColumn(name = "idBook")},
            inverseJoinColumns = {@JoinColumn(name = "autorId")}
    )
    private Set<Autor> author;







    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }


    public String getBookName() {
        return bookName;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public Set<Borrow> getBorrow() {
        return borrow;
    }

    public Set<Autor> getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                '}';
    }



}
