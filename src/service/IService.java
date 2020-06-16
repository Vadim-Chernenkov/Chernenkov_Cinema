package service;

import models.*;

import java.util.List;

public abstract class IService {

    abstract public List<User> getAllUsers(Cinema cinema);
}
