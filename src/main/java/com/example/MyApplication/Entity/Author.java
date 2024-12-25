package com.example.MyApplication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "authors")
public class Author extends BaseEntity{

    @Column(name = "name")
    private String name;


    @Column(name = "quote")
    private String quote;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "description")
    private String description;

    @Column(name = "birthday")
    private LocalDateTime birthDay;

    @Column(name = "dead_day")
    private LocalDateTime deadDay;

}
