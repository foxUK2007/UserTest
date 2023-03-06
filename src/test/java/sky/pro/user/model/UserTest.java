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

    private final User user = new User();

    public static final String LOGIN_NULL = null;
    public static final String EMAIL_FAULT = "fox_23jmail.com";

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
        Assertions.assertEquals("fox", user.getLogin(login));
    }

    @Test
    void shouldGetLoginWhenLoginIsNull() {
        String result = user.getLogin(null);
        Assertions.assertEquals(LOGIN_NULL, result);
    }

    @Test
    void shouldGetEmailWhenIsFault() {
        String result = user.getEmail(EMAIL_FAULT);
        Assertions.assertTrue(result.contains(EMAIL_FAULT));

    }

    @Test
    void shouldGetEmail() {
        Assertions.assertEquals("fox_23@jmail.com", user.getEmail(email));
    }

    @Test
    void shouldGetUser(){
        String result = user.getUser();
        Assertions.assertEquals(user.toString(), result);
    }

}