package com.bookstore.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Books;
@Repository
public interface BookstoreDaoInterface extends JpaRepository<Books, String>{
	
	
	@Query("from com.bookstore.entity.Books b where b.title=:tt and b.author=:at")
	List<Books> searchbook(@Param("tt")String title, @Param("at")  String author);
	
	
	


	@Query("from com.bookstore.entity.Books b where b.title=:tt and b.author=:at")
	Books viewbook(@Param("tt")String title, @Param("at")  String author);
	
	
}
