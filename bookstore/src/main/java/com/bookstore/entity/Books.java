package com.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="bookstore")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Bookid;
	private String title;
	private String author;
	private String price;
	
	public Long getBookid() {
		return Bookid;
	}
	public void setBookid(Long bookid) {
		Bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
