 package com.bookmanage.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmanage.demo.dao.BookDao;
import com.bookmanage.demo.model.Book;

@RestController
public class Sample {
	
	@Autowired
	BookDao bd;
	
	@RequestMapping(value="/get")
	public List<Book> get(){
		return bd.getall();
	}
	
	//@ResponseBody
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public 	static Book insert(@RequestBody Book ba) {
		System.out.println("hiiiiiiiii");
		//return ba;
		return BookDao.insertall(ba);
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public static Book delete(@RequestBody Book b) {
		return BookDao.delete(b);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public static Book update(@RequestBody Book ba) {
		return BookDao.update(ba);
	}
	
}



