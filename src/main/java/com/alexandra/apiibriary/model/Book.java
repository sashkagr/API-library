package com.alexandra.apiibriary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    int id;
    @Column(name="author")
    String author;
    @Column(name="name")
    String name;
    @Column(name="description")
    String description;
}
