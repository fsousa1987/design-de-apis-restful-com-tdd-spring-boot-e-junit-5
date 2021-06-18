package br.com.francisco.libraryapi.service.impl;

import br.com.francisco.libraryapi.exception.BusinessException;
import br.com.francisco.libraryapi.model.entity.Book;
import br.com.francisco.libraryapi.model.repository.BookRepository;
import br.com.francisco.libraryapi.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        if (repository.existsByIsbn(book.getIsbn())) {
            throw new BusinessException("Isbn já cadastrado");
        }

        return repository.save(book);
    }

    @Override
    public Optional<Book> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public Book update(Book book) {
        return null;
    }
}
