package sky.pro.user.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sky.pro.user.impl.UserDaoImpl;

class UserTest {

    private final static String NAME = "Пользователь 1";

    public static final String ILLEGAL_NAME = "Петр";

     private static UserDaoImpl userDao;


    @BeforeAll
    public static void createUser() {
        userDao = new UserDaoImpl();

    }

    @AfterAll
    private static void afterAll() {
        System.out.println("Test is finished");
    }

    @Test
    void shouldGetTrueWhenUserExists() {
        String result = userDao.getUserByName(NAME);
        Assertions.assertTrue(result.contains(NAME));
    }

    @Test
    void shouldGetUser() {
        Assertions.assertEquals(NAME, userDao.getUserByName(NAME));
    }
    @Test
    void shouldGetNullWhenUserIsFault() {
        Assertions.assertNull(null, userDao.getUserByName(ILLEGAL_NAME));

    }

}