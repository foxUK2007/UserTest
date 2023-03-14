package sky.pro.user.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sky.pro.user.impl.UserDaoImpl;
import sky.pro.user.impl.UserServiceImpl;
import sky.pro.user.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    private static final List<User> USER_LIST_CORRECT = new ArrayList(Arrays.asList(new User("Пользователь 1"), new User("Пользователь 2")));
    private static final List<User> USER_LIST_IN_CORRECT = new ArrayList(Arrays.asList(new User("Фёдор"), new User("Семён")));
    private static User userCorrect;
    private static User userInCorrect;
    private final UserDaoImpl userDaoMock = mock(UserDaoImpl.class);

    @Mock
    UserDaoImpl userDao;

    @InjectMocks
    UserServiceImpl out;

    @BeforeEach
    public void initOut() {
        userDao = new UserDaoImpl();
    }

    @BeforeEach
    void createNewUser() {
        userCorrect = new User("Пользователь 1");
        userInCorrect = new User("Пользователь 2");
    }

    @Test
    void shouldCheckUserExistReturnTrue() {
        when(userDaoMock.findAllUsers()).thenReturn(USER_LIST_CORRECT);
        Assertions.assertTrue(out.checkUserExist(userCorrect));

    }

    @Test
    void shouldCheckUserExistReturnFalse() {
        when(userDaoMock.findAllUsers()).thenReturn(USER_LIST_IN_CORRECT);
        Assertions.assertFalse(out.checkUserExist(userInCorrect));
    }
}


