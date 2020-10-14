package test;


import dao.impl.UserDao;
import dao.impl.UserDaoimp;
import pojo.User;

public class UserDaoTest {

    public void queryUserByusername() {
        UserDao userDao = new UserDaoimp();
        System.out.println(userDao.queryUserByusername("zyy"));
    }

    public static void main(String[] args) {
        UserDaoTest userDaoTest = new UserDaoTest();
        userDaoTest.queryUserByusername();
        userDaoTest.queryUserByNameAndPassword();

    }
    public void saveUser() {
        UserDao userDaoTest = new UserDaoimp();
        User user = new User();
        user.setUsername("zy123y");
        user.setPassword("123456");
        user.setEmail("13216546");
        System.out.println(userDaoTest.saveUser(user));
    }


    public void queryUserByNameAndPassword() {
        UserDao userDao = new UserDaoimp();
        System.out.println(userDao.queryUserByNameAndPassword("wyx","123456"));
    }
}