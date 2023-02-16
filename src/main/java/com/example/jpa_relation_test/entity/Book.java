package com.example.jpa_relation_test.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "book_store_id", nullable = false)
    private BookStore bookStore;

    @OneToMany(mappedBy = "book")
    private List<Purchase> purchases = new ArrayList<>();
}
