package servlet;

import pojo.User;
import service.impl.UserServiceImp;
import java.io.IOException;

public class Regist extends javax.servlet.http.HttpServlet {
    UserServiceImp userServiceImp = new UserServiceImp();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String email = request.getParameter("email");
        String code = request.getParameter("code");
        if (code.equalsIgnoreCase("abcd")){
            if(userServiceImp.existUsername(username)){
                System.out.println("用户名存在");
                request.setAttribute("msg","用户名已存在");
                request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);
            }
            else{
                User user = new User(null,username,password,email);
                userServiceImp.registUser(user);

                request.getRequestDispatcher("/pages/user/regist_success.jsp").forward(request,response);
            }
        }
        else{
            System.out.println("验证码错误");
            request.setAttribute("msg","验证码错误");
            request.setAttribute("username",username);
            request.setAttribute("password",password);
            request.setAttribute("email",email);
            request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Come in Get");
    }
}
