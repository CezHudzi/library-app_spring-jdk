package com.libery.liberyaplication.services;


import com.libery.liberyaplication.mapperDTO.*;
import com.libery.liberyaplication.repo.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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


    public List<AutorResponse> getAllAutor() {

        return autorRepository.findAll().stream().map(autorMapper::autorResponse).collect(Collectors.toList());

    }



}
