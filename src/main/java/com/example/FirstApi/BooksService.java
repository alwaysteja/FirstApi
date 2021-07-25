package com.example.FirstApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepo;

    public ArrayList<Books> getAll(){
        ArrayList<Books> books=new ArrayList<>();
        for(Books b:booksRepo.findAll()){
        books.add(b);
        }

        return books;
    }
    public void delete(int id){
        booksRepo.deleteById(id);
    }
      public void saveOrUpdate(Books books){
        booksRepo.save(books);
      }
   public Books getBooksById(int id)   
  {  
return booksRepo.findById(id).get();  
} 
    
}
