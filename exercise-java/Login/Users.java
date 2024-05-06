package Entrega.Compass.Login;

public class Users {
    private String username;
    private String password;


    public boolean checkUser(Users users) {
        return this.username.equals(users.username)&&this.password.equals(users.password);

    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
