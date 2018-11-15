package com.booktracer.service;

import com.booktracer.dto.BookDTO;

public interface IBookService {
	
	BookDTO findOneByID(long id);
	
	BookDTO updateStatus(String status);

}
