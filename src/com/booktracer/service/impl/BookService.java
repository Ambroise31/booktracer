package com.booktracer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booktracer.dto.BookDTO;
import com.booktracer.persistence.entity.Book;
import com.booktracer.persistence.repository.IBookRepository;
import com.booktracer.service.IBookService;

@Service
public class BookService implements IBookService {
@Autowired
IBookRepository bookRepo;
	
	@Override
	public BookDTO findOneByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDTO updateStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDTO> findAll() {
		List<BookDTO> result = new ArrayList<>();
		List<Book> books = bookRepo.findAll();
		for (Book book : books) {
			BookDTO temp = new BookDTO();
			temp.setId(book.getId());
			temp.setName(book.getName());
			temp.setStatus(book.getStatus());
			result.add(temp);
		}

		return result;
	}
}
