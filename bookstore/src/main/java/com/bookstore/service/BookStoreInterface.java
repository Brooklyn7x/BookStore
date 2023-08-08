package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Books;
import com.bookstore.exceptions.BookNotFoundException;

public interface BookStoreInterface {


	Books viewbookservice(Books book) throws BookNotFoundException;

	void addbookserivce(Books book);

	List<Books> viewallbookserivce();

	List<Books> searchbookserivce(Books book);

	void deletebook(String title);

	

}
