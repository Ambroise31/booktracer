package com.booktracer.service;

import java.util.List;

import com.booktracer.dto.BookDTO;

public interface IBookService {
	
	BookDTO findOneByID(long id);
	
	BookDTO updateStatus(String status);

	List<BookDTO> findAll();

	

}
