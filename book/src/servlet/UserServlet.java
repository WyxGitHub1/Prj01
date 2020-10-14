package servlet;

import pojo.User;
import service.impl.UserService;
import service.impl.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet")
public class UserServlet extends BaseServlet {

    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService userService = new UserServiceImp();
        User user = new User(null,username,password,null);
        User login = userService.login(user);
        if(login == null){
            System.out.println("用户名密码错误");
            request.setAttribute("loginMsg","用户名密码错误");
            request.setAttribute("username",username);
            request.getRequestDispatcher("/pages/user/login.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("/pages/user/login_success.jsp").forward(request,response);
        }
    }

    public void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        UserServiceImp userServiceImp = new UserServiceImp();
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        if (code.equalsIgnoreCase("abcd")){
            if(userServiceImp.existUsername(username)){
                System.out.println("用户名存在");
                request.setAttribute("registMsg","用户名已存在");
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
            request.setAttribute("registMsg","验证码错误");
            request.setAttribute("username",username);
            request.setAttribute("password",password);
            request.setAttribute("email",email);
            request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);
        }

    }

}
