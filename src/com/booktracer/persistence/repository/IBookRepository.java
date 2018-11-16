package com.booktracer.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booktracer.persistence.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Long>{

	

	

}
