package com.libery.liberyaplication.repo;
import com.libery.liberyaplication.model.*;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositiry extends JpaRepository<Book, Long> {
}
