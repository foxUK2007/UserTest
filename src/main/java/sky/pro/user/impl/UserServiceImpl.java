package sky.pro.user.impl;

import sky.pro.user.dao.UserDao;
import sky.pro.user.model.User;
import sky.pro.user.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public boolean checkUserExist(User user) {
        if (userDao.findAllUsers().contains(user))
            return true;
        else {
            return false;
        }
    }
}
