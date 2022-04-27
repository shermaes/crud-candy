package com.crud.crudcandy.service;

import com.crud.crudcandy.entity.Candy;

import java.util.List;

public interface CandyServiceInterface {
    List<Candy> getAllCandys();

    Candy saveCandy(Candy candy);

    Candy updateCandy(Candy candy);

    void deleteCandy(Long id);
}
