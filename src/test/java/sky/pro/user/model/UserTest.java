package sky.pro.user.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static String login;

    private static String email;

    private final User user = new User(login, email);

    private final static String LOGIN = "fox";
    public static final String LOGIN_NULL = null;

    public static final String EMAIL_FAULT = "fox_23jmail.com";

    public static final String ILLEGAL_LOGIN = "fox_23@jmail.com";

    public static final String ILLEGAL_EMAIL = "fox";

    @BeforeAll
    private static void createUser() {
        login = "fox";
        email = "fox_23@jmail.com";

    }

    @AfterAll
    private static void afterAll() {
        System.out.println("Test is finished");
    }

    @Test
    void shouldGetLogin() {
        Assertions.assertEquals(LOGIN, user.getLogin());
    }

    @Test
    void shouldGetLoginWhenLoginIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->user.setLogin(LOGIN_NULL));
    }

    @Test
    void shouldGetEmailWhenIsFault() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->user.setEmail(EMAIL_FAULT));

    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenLoginEqualsEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->user.createUser(ILLEGAL_LOGIN, ILLEGAL_EMAIL));

    }


}