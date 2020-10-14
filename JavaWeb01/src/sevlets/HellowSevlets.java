package sevlets;

import javax.servlet.*;
import java.io.IOException;

public class HellowSevlets implements Servlet {
    public static void main(String[] args) {

    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("被访问了");
        ServletContext servletContext = this.getServletConfig().getServletContext();

    }



    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
