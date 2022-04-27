package com.crud.crudcandy.repository;

import com.crud.crudcandy.entity.Candy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandyRepository extends JpaRepository<Candy, Long> {
}
