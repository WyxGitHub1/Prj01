package service.impl;

import dao.impl.BookDao;
import dao.impl.BookDaoImp;
import pojo.Book;

import java.util.List;

public class BookServiceImp implements BookService{
    private BookDao bookDao = new BookDaoImp();

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookByIDd(id);
    }

    @Override
    public List<Book> queryBook() {
        return bookDao.queryBooks();
    }
}
