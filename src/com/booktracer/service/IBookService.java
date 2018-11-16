package com.booktracer.service;

import java.util.List;

import com.booktracer.dto.BookDTO;
import com.booktracer.persistence.entity.Book;

public interface IBookService {
	
	BookDTO findOneByID(long id);
	
	BookDTO updateStatus(String status);

	List<BookDTO> findAll();

	

}
