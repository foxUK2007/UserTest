package sky.pro.user.model;

public class User {

    private String login;

    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null) {
            throw new IllegalArgumentException("Неправильный логин");
        } else
            this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == "fox_23jmail.com") {
            throw new IllegalArgumentException("Неправильный email");
        } else
            this.email = email;
    }

    public void createUser(String login, String email) {
        if (login == "fox_23@jmail.com") {
            throw new IllegalArgumentException("Логин не может быть таким же как емэйл");
        } else
            this.login = login;
        if (email == "fox") {
            throw new IllegalArgumentException("Емэйл не может быть таким же как логин");
        } else {
            this.email = email;
        }
    }
}



