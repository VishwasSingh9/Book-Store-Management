package com.jsp.BookStoreManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.BookStoreManagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
