package com.alexandra.apiibriary.controller;

import com.alexandra.apiibriary.model.Book;
import com.alexandra.apiibriary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookRepository bookRepository;
    @PostMapping
    public void create(@RequestBody Book book)
    {
    bookRepository.save(book);
    }
    @GetMapping("/{id}")
    public Book read(@PathVariable int id)
    {
        Book book = bookRepository.getReferenceById(id);

        return book;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id)
    {
        bookRepository.deleteById(id);

    }
    @PutMapping("/{id}")
    public void update(@RequestBody Book book, @PathVariable int id)
    {
        Book book1 = bookRepository.getReferenceById(id);
        if (book.getName() != null)
        {
            book1.setName(book.getName());
        }
        if (book.getAuthor() != null)
        {
            book1.setAuthor(book.getAuthor());
        }
        if (book.getDescription() != null)
        {
            book1.setDescription(book.getDescription());
        }
        bookRepository.save(book1);
    }

}
