package com.example.jpa_relation_test.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@NoArgsConstructor
@Table(name = "Bookstore")
public class BookStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_store_id")
    private Long id;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "bookStore")
    private List<Book> bookList = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "book_store_id")
    private List<Member> memberList = new ArrayList<>();


}
