package sky.pro.user.dao;

import org.springframework.stereotype.Service;
import sky.pro.user.model.User;

import java.util.List;

@Service
public interface UserDao {

    String getUserByName(String name);

    List<User> findAllUsers();
}
