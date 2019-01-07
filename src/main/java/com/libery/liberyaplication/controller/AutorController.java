package com.libery.liberyaplication.controller;


import com.libery.liberyaplication.mapperDTO.AutorCreateDTO;
import com.libery.liberyaplication.mapperDTO.AutorResponse;
import com.libery.liberyaplication.mapperDTO.PersonCreateDTO;
import com.libery.liberyaplication.mapperDTO.PersonResponse;
import com.libery.liberyaplication.services.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autors")
public class AutorController {


    private final AutorService autorService;


    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }


    @GetMapping
    public List<AutorResponse> getAllPerson()
    {
        return autorService.getAllAutor();
    }






    @PostMapping
    public void addPerson(@RequestBody AutorCreateDTO autorDTO) {
        autorService.addAutor(autorDTO);
    }





}
