package br.com.francisco.libraryapi.service.impl;

import br.com.francisco.libraryapi.model.entity.Book;
import br.com.francisco.libraryapi.model.repository.BookRepository;
import br.com.francisco.libraryapi.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }
}
