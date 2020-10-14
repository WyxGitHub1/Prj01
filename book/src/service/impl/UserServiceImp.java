package service.impl;

import dao.impl.UserDao;
import dao.impl.UserDaoimp;
import pojo.User;

public class UserServiceImp implements UserService{

    private UserDao userDao = new UserDaoimp();
    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByNameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        return !(userDao.queryUserByusername(username) == null);
    }
}
