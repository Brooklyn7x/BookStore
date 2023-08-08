package com.bookstore.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Dao.BookstoreDaoInterface;
import com.bookstore.entity.Books;
import com.bookstore.exceptions.BookNotFoundException;


@Service
@Transactional
public class BookstoreSerivce implements BookStoreInterface {

	@Autowired
	private BookstoreDaoInterface bd;
	
	
	@Override
	public Books viewbookservice(Books book)throws BookNotFoundException {
		return bd.viewbook(book.getTitle(),book.getAuthor());
	}

	@Override
	public void addbookserivce(Books book) {
		bd.save(book);
	}

	@Override
	public List<Books> viewallbookserivce() {
		return bd.findAll();
	}

	@Override
	public List<Books> searchbookserivce(Books book) {
	  return bd.searchbook(book.getTitle(),book.getAuthor());
	
	}

	@Override
	public void deletebook(String title) {
		bd.deleteById(title);
		
	}

	





}
