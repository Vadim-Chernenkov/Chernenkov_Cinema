package service;

import models.Cinema;
import models.User;

import java.util.List;

public class CinemaService extends IService {


    @Override
    public List<User> getAllUsers(Cinema cinema) {
        updateUsers(cinema);
        return cinema.getUsers();
    }

    public static void updateUsers(Cinema cinema) {
        List<User> users = FileService.getAllUsers();
        cinema.setUsers(users);
    }
}
