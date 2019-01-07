package com.libery.liberyaplication.mapperDTO;


import com.libery.liberyaplication.model.Autor;
import com.libery.liberyaplication.model.Person;
import org.springframework.stereotype.Component;

@Component
public class AutorMapper {


    public AutorMapper() {
    }

    public Autor createNew (AutorCreateDTO AutorDTO)
    {
        Autor autor = new Autor();
        autor.setLastName(AutorDTO.getLastName());
        autor.setFirstName(AutorDTO.getFirstName());
        return autor;
    }


    public AutorResponse autorResponse(Autor autor)
    {
        return new AutorResponse(autor.getAutorId(),autor.getFirstName(), autor.getLastName(), autor.getBook());
    }




}
