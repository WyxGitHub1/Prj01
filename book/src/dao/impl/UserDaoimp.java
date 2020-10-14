package dao.impl;

import pojo.User;

public class UserDaoimp extends BaseDao implements UserDao {
    @Override
    public User queryUserByusername(String username) {
        String sql = "select * from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }
    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user (username,password,email) values(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
    @Override
    public User queryUserByNameAndPassword(String username, String password) {
        String sql = "select * from t_user where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }
}
