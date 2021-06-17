package br.com.francisco.libraryapi.service;

import br.com.francisco.libraryapi.model.entity.Book;

import java.util.Optional;

public interface BookService {

    Book save(Book any);
    Optional<Book> getById(Long id);
}
