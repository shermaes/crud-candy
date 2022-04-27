package com.crud.crudcandy.service;

import com.crud.crudcandy.entity.Candy;
import com.crud.crudcandy.repository.CandyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandyService implements CandyServiceInterface{

    @Autowired
    private CandyRepository candyRepository;

    @Override
    public List<Candy> getAllCandys(){ return candyRepository.findAll();}

    @Override
    public Candy saveCandy(Candy candy){ return candyRepository.save(candy);}

    @Override
    public Candy updateCandy(Candy candy){ return candyRepository.save(candy);}

    @Override
    public void deleteCandy(Long id){ candyRepository.deleteById(id);}



}
