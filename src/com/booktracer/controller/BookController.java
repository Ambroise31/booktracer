package com.booktracer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.booktracer.service.IBookService;

@Controller
@RequestMapping("/Book")
public class BookController {

	@Autowired
	public IBookService bookService;
	
	
}
