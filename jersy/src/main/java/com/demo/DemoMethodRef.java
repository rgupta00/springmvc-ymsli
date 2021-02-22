package com.demo;

import java.util.Optional;
import java.util.function.Supplier;
class BookNotFoundException extends RuntimeException{}
public class DemoMethodRef {

	public static void main(String[] args) {
		//Book book=getBookById(22).orElseThrow(()-> new BookNotFoundException());
		Book book=getBookById(22).orElseThrow(BookNotFoundException:: new);
	}
	
	public static Optional<Book> getBookById(int id){
		return Optional.ofNullable(null);
	}
}

