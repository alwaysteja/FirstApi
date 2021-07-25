package com.example.FirstApi;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BooksController {
     @Autowired
    BooksService booksSer;

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
    @GetMapping("/books")
    public ArrayList<Books> getAll(){
        return booksSer.getAll();
    }
  @PostMapping("/book")
    public int save(@RequestBody Books books){
        booksSer.saveOrUpdate(books);
       
        return books.getBookid();
    }
    @GetMapping("/book/{bookid}")  
public Books getBooks(@PathVariable("bookid") int bookid)   
{  
return booksSer.getBooksById(bookid);  
}  
@DeleteMapping("/book/{bookid}")
public String Delete(@PathVariable("bookid") int id){
    booksSer.delete(id);

    return "Deleted";
}
@PutMapping("/books")
    public int update(@RequestBody Books books){
        booksSer.saveOrUpdate(books);
       
        return books.getBookid();
    }
    
}
