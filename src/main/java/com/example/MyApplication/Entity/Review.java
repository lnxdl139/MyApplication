package com.example.MyApplication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "reviews")
public class Review extends BaseEntity {

    @Column(name = "book_id")
    private String bookId;

    @Column(name = "point")
    private Integer point;

    @Column(name = "reviewer")
    private String reviewer;

    @Column(name = "comment")
    private String comment;
}
