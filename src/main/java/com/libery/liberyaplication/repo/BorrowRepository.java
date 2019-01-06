package com.libery.liberyaplication.repo;


import com.libery.liberyaplication.model.Borrow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends CrudRepository<Borrow, Long> {






}
