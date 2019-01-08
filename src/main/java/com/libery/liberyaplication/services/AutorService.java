package com.libery.liberyaplication.services;


import com.libery.liberyaplication.mapperDTO.*;
import com.libery.liberyaplication.model.Autor;
import com.libery.liberyaplication.model.Book;
import com.libery.liberyaplication.repo.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class AutorService {

    private final AutorRepository autorRepository;
    private final AutorMapper autorMapper;

    public AutorService(AutorRepository autorRepository, AutorMapper autorMapper) {
        this.autorRepository = autorRepository;
        this.autorMapper = autorMapper;
    }



    public void addAutor(AutorCreateDTO autorDTO) {
    autorRepository.save(autorMapper.createNew(autorDTO));
    }


    public Autor getAutorById(Integer autorId)
    {

        Optional<Autor> autor = autorRepository.findById(autorId.longValue());

    if (autor.isPresent())
    {
        return autor.get();
    }
    else
    {

        return new Autor();
    }


    }


    public List<AutorResponse> getAllAutor() {

        return autorRepository.findAll().stream().map(autorMapper::autorResponse).collect(Collectors.toList());


    }



}
