package servlet;

import pojo.Book;
import service.impl.BookService;
import service.impl.BookServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet {

    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BookService bookService = new BookServiceImp();
        List<Book> books = bookService.queryBook();
        request.setAttribute("books",books);

        request.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(request,response);

    }
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
