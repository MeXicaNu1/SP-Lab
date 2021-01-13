package ro.euvt.springtest.repository;

import ro.euvt.springtest.models.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
