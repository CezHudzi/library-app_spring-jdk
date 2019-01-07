package com.libery.liberyaplication.controller;


import com.libery.liberyaplication.mapperDTO.PersonCreateDTO;
import com.libery.liberyaplication.mapperDTO.PersonResponse;
import com.libery.liberyaplication.services.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }



    @GetMapping
    public List<PersonResponse> getAllPerson()
    {
        return personService.getAllPersonServ();
    }






    @PostMapping
    public void addPerson(@RequestBody PersonCreateDTO person) {
        personService.addPerson(person);
    }





}
