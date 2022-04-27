package com.crud.crudcandy.controller;


import com.crud.crudcandy.entity.Candy;
import com.crud.crudcandy.service.CandyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CandyController {

    @Autowired
    private CandyServiceInterface service;

    @GetMapping("get/candys")
    public List<Candy> getAllCandys(){return service.getAllCandys();}

    @PostMapping("save/candy")
    public Candy saveCandy(@RequestBody Candy candy){ return service.saveCandy(candy);}

    @PutMapping("update/candy")
    public Candy updateCandy(@RequestBody Candy candy){return service.updateCandy(candy);}

   @DeleteMapping("delete/candy/{id}")
   public void deleteCandy(@PathVariable Long id){service.deleteCandy(id);}

}
