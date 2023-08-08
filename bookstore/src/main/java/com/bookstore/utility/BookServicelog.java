package com.bookstore.utility;

import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

import com.bookstore.entity.Books;

@Aspect
@Component
public class BookServicelog {
	public static Logger log = Logger.getLogger("BookstoreService");
	
	
	@Before(value="execution(* com.bookstore.service.BookstoreSerivce.*(..))")
	public void beforeExecution(JoinPoint jj ) {
		log.info("before execution of "+ jj.getSignature());
		
	}
	
	@After(value="execution(* com.bookstore.service.BookstoreSerivce.*(..))")
	public void afterExecution(JoinPoint jj ) {
		log.info("before execution of "+ jj.getSignature());
		
	}
	

}
