package com.libery.liberyaplication.services;


import com.libery.liberyaplication.mapperDTO.PersonCreateDTO;
import com.libery.liberyaplication.mapperDTO.PersonMapper;
import com.libery.liberyaplication.mapperDTO.PersonResponse;
import com.libery.liberyaplication.repo.PersonRepository;
import com.libery.liberyaplication.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {


    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

//TODO WPISAC TO MAPOWANIE
    public Optional<Person> findF(Long i)
    {
      return personRepository.findById( i );
    }


    public void addPerson(PersonCreateDTO personDTO) {
        personRepository.save(personMapper.createNew(personDTO));
    }

    public List<PersonResponse> getAllPersonServ() {

        return personRepository.findAll().stream().map(personMapper::cereateResponse).collect(Collectors.toList());

    }
}
