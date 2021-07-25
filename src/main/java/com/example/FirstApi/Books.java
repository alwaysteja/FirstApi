
package com.example.FirstApi;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="books")
@Entity
public class Books {
    @Column(name = "bookid")
    @Id
    public int bookid;
    @Column(name = "bookname")
    public String bookname;
    @Column(name = "author")
    public String author;
    @Column (name = "price")
    public int price;
    
  public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookName(String bookname) {
        this.bookname = bookname;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }




    
}
