package com.crud.crudcandy.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="Candy")
@Table(name="candy")
@Data   //Que hace esta etiqueta?
public class Candy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;

    private String flavor;

    private String factory;

    private Integer quantity;

    // you can use@
}
