package test;

import org.junit.Test;
import pojo.User;
import service.impl.UserService;
import service.impl.UserServiceImp;

public class UserServiceImpTest {
    @Test
    public void registUser() {
    }
    @Test
    public void login() {
    }
    @Test
    public void existUsername() {
    }
    public static void main(String[] args) {
        UserService userService = new UserServiceImp();

        User user = new User(null,"bbb","123456","321686263");

        System.out.println(userService.existUsername("123124"));

    }
}