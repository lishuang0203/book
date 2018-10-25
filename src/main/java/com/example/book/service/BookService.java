package com.example.book.service;


import com.example.book.entity.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> getAll();

    Book getId(int id);

    void delete(int id);
}
