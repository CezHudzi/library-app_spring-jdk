package com.libery.liberyaplication.mapperDTO;


import com.libery.liberyaplication.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {



    public PersonMapper() {

    }



    public Person createNew (PersonCreateDTO PersonDTO)
    {
        Person person = new Person();
        person.setFirstName(PersonDTO.getFirstName());
        person.setLastName(PersonDTO.getLastName());
        return person;
    }


    public PersonResponse cereateResponse(Person person)
    {
        return new PersonResponse(person.getIdUser(),person.getFirstName(),person.getLastName());
    }




}
