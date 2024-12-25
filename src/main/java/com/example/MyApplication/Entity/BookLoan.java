package com.example.MyApplication.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "book_loans")
public class BookLoan extends BaseEntity {

    @Column(name = "book_id")
    private String bookId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "loan_date")
    private String loanDate;

    @Column(name = "return_date")
    private String returnDate;
}
