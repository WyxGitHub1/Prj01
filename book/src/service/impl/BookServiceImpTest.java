package service.impl;

import org.junit.Test;
import pojo.Book;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceImpTest {
    BookService bookService = new BookServiceImp();
    @Test
    public void addBook() {
    }

    @Test
    public void deleteBookById() {
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(2,"孙孙孙","123", new BigDecimal(200),200,200,null));
    }

    @Test
    public void queryBookById() {
        bookService.queryBookById(2);
    }

    @Test
    public void queryBook() {

    }
}