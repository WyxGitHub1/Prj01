package dao.impl;

import pojo.User;

public interface UserDao {
    //查询
    public User queryUserByusername(String username);
    //保存
    public int saveUser(User user);
    //查询密码
    public User queryUserByNameAndPassword(String username,String password);


}
