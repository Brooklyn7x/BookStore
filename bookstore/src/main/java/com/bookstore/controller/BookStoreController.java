package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.entity.Books;
import com.bookstore.exceptions.BookNotFoundException;
import com.bookstore.service.BookStoreInterface;

@RestController
public class BookStoreController {
	
	@Autowired
	private BookStoreInterface bs;
	

	@PostMapping("addnewbook")
	public String addnewbook(@RequestBody Books book ) {
		 bs.addbookserivce(book);
		 return "New Book added";
		 
		 
	}
	
	
	@GetMapping("viewallbook")
	public String ViewallBook() {
		
		return bs.viewallbookserivce().toString();
	}
	
	
	
	
	
	
	@GetMapping("searchbook/{title}/{author}")
	public List<Books> searchBook(@PathVariable("title")String title, @PathVariable("author")String author) {
		Books book = new Books();
		book.setTitle(title);
		book.setAuthor(author);
	   return bs.searchbookserivce(book);
	    
		
	}
	
	
	
	
	
	@DeleteMapping("deletebook/{title}")
	public String deletebook(@PathVariable("title")String title) {
		bs.deletebook(title);
		return "Deleted BOOK";
	}
	
	
	
	
	
		@GetMapping("viewbook")
	public String ViewBook() {
		return bs.viewbookservice();
	}
	
		
		
	@GetMapping("viewbook/{title}/{author}")
	public Books ViewBook(@PathVariable("title")String title, @PathVariable("author")String author)throws BookNotFoundException{
			try {
		
		
		Books book = new Books();
		book.setTitle(title);
		book.setAuthor(author);
		
			Books bb = bs.viewbookservice(book);
			return bb;
		} 
			
		catch(BookNotFoundException bc) {
			throw bc;
		
			
		}
	
	}

	/*
	
	
	@PutMapping("editbook")
	public String editbookname() {
		return bs.editbooknameservice();
	}
	
	
	@DeleteMapping("deletebook")
	public String deletebook() {
		return bs.deletebook();
	}
	
	
	*/
	
	
	
	
}
