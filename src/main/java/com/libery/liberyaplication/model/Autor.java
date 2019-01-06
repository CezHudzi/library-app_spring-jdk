package com.libery.liberyaplication.model;

import javax.persistence.*;
import java.util.Set;



@Entity
public class Autor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autorId;

    private String name;
    private String lastName;


    @ManyToMany(mappedBy = "author")
    private Set<Book> book;



}
