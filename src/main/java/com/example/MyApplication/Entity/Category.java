package com.example.MyApplication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "categories")
@Data
public class Category extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "parent_id")
    private String parentId;
}
