package com.libery.liberyaplication.repo;


import com.libery.liberyaplication.model.Autor;
import com.libery.liberyaplication.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
