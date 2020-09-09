package com.omar.webapp.repositories;

import com.omar.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public  interface AuthorRepository extends CrudRepository<Author, Long> {
}
