package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.book.model.Author;


@Repository
public interface AuthorRepository extends JpaRepository<Author,String> {

}
