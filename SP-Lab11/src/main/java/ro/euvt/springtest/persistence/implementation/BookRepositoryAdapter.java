package ro.euvt.springtest.persistence.implementation;

import ro.euvt.springtest.persistence.interfaces.CrudRepository;
import ro.euvt.springtest.models.Book;
import ro.euvt.springtest.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryAdapter implements CrudRepository<Book> {

    private BookRepository bookRepository;

    @Autowired
    public BookRepositoryAdapter(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Long save(Book object) {
        return bookRepository.save(object).getId();
    }

    @Override
    public Book getById(Long id) {
        return bookRepository.findById(id).orElse(new Book("Book"));
    }
}
