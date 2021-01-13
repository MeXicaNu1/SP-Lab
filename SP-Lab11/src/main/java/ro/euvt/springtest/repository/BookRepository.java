package ro.euvt.springtest.repository;

import ro.euvt.springtest.models.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
