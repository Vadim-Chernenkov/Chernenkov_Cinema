package service;
import models.*;

public class UserService {
    public static void loginUser(String login, String password) {
    }

    public static User registerUser(String login, String password, Cinema cinema) {
        User user = new User(login, password);
        return CinemaService.addUser(user, cinema);
    }
}