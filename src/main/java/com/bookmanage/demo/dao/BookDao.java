package com.bookmanage.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.bookmanage.demo.model.Book;

@Repository
public class BookDao {
	
	public static Map<Integer,Book> m=new HashMap<>();
		static {
			m.put(1,new Book(101, "god of cricket", "murugan"));
			m.put(2,new Book(102, "c++ language", "Balagurusamy"));
			m.put(3,new Book(103, "Ja	va language", "ganguly"));
			m.put(4,new Book(104, ".Net languange", "dravid"));
			
		}
			
		public List<Book> getall(){
			
			List<Book>valueList =m.values().stream().collect(Collectors.toList());
			//System.out.println(valueList);
        	return  valueList;	
		}
          
		public static Book insertall(Book book) {
			//int index=3;
			//book.setId(index);
			m.put(book.getId(), book);
			//m.put(1, new Book(book.getId(), book.getTitle(), book.getAuthor()));
			//List<Book>valueList =m.values().stream().collect(Collectors.toList());
			return book;
		}
		public static Book delete(Book book) {
			m.remove(book.getId());
			return book;
		}
		
		public static Book update(Book book) {
			System.out.println("key : "+m.keySet());
			m.replace(book.getId(), book); 	 	
			System.out.println(book);
			System.out.println(m);
			return book;
		}
		
}
