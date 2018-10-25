package com.example.book.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String avatar;
    private String name;
    private String author;
    private String type;
    private String remark;
    private String publish;
    private String pages;
    private String price;
}
