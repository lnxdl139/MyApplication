package com.example.MyApplication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.SQLRestriction;
import org.jetbrains.annotations.NotNull;

@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "books")
@Data
@SQLRestriction("deletedAt is null")
public class Book extends BaseEntity {

    @NotNull
    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    @Column(name = "publishing_house")
    private String publishingHouse;

    @Column(name = "republish")
    private Integer republish;

    @Column(name = "translator")
    private String translator;

    @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "loan_type")
    private Integer loanType;~

    @Column(name = "loan_free")
    private Integer loanFree;

    @Column(name = "published_at")
    private String publishedAt;

    @Column(name = "status")
    private String status;
}
