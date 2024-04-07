package com.jsp.BookStoreManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.BookStoreManagement.entity.MyBookList;
import com.jsp.BookStoreManagement.repository.MyBookRepository;

@Service
public class MyBookService {
	
	@Autowired
	private MyBookRepository myBook;
	
	public void saveMyBooks(MyBookList book) {
		myBook.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myBook.findAll();
	}
	public void deleteById(int id) {
		myBook.deleteById(id);
	}
}
