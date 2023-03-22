package sky.pro.user.impl;

import sky.pro.user.model.User;
import sky.pro.user.dao.UserDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public List<User> userList;

    public UserDaoImpl() {
        this.userList = new ArrayList<>(Arrays.asList(new User("Пользователь 1"), new User("Пользователь 2")));
    }

    @Override
    public String getUserByName(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user.getName();
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        if (userList.isEmpty()) {
            throw new IllegalArgumentException("Пользователи не найдены");
        } else {
            return userList;
        }
    }
}
