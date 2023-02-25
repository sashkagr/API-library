package com.alexandra.apiibriary.repository;

import com.alexandra.apiibriary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
