package test;

import dao.impl.BookDao;
import dao.impl.BookDaoImp;
import org.junit.Test;
import pojo.Book;

import java.math.BigDecimal;

public class BookDaoTest {
    BookDao bookDao = new BookDaoImp();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"大111概","11",new BigDecimal(9999),200,200,null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(8);
    }

    @Test
    public void updateBook() {

        bookDao.updateBook(new Book(1,"大撒啊啊","11",new BigDecimal(9999),200,200,null));
    }

    @Test
    public void queryBookByIDd() {

        System.out.println(bookDao.queryBookByIDd(1));
    }

    @Test
    public void queryBooks() {

        for (Book book : bookDao.queryBooks()){
            System.out.println(book);
        }
    }
}