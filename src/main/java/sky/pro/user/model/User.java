package sky.pro.user.model;

public class User {

    private String login;

    private String email;

    public String getLogin(String login){
        return login;
    }

    public String getLogin(){
        return null;
    }

    public String getEmail(String email){
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUser(){
        return toString();
    }
}
