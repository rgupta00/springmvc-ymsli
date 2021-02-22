package com.demo;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class BookRestController {

	private BookService bookService=new BookServiceImp();
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Book> getAllbooks(){
		return bookService.getAllBooks();
	}
	
	//http://localhost:8080/jersy/api/book/121
	
	@GET
	@Path("/{bookId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getAnbooks(@PathParam("bookId")int id){
		return bookService.getBookById(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)//i will send json to the user
	@Consumes(MediaType.APPLICATION_JSON)//hey client (postman) i consume json. mediamoxy jar
	public Book addBook(Book book) {
		return bookService.addBook(book);
	}
	

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{bookId}")
	public Book updateBook(@PathParam("bookId") int bookId, Book book){
		book.setId(bookId);
		bookService.updateBook(book);
		return book;
	}
	
	@DELETE
	@Path("/{bookId}")
	public void delete(@PathParam("bookId") int bookId){
		bookService.removeBook(bookId);
	}
	
	
}
