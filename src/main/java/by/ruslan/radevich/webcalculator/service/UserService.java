package by.ruslan.radevich.webcalculator.service;

import by.ruslan.radevich.webcalculator.entity.User;
import by.ruslan.radevich.webcalculator.storage.InMemoryUserStorage;
import by.ruslan.radevich.webcalculator.storage.UserStorage;

import java.util.Optional;

public class UserService {
    private static UserService instance;

    private UserService() {

    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }
    private final UserStorage userStorage = new InMemoryUserStorage();

    public void create(String name, String username, String password) {
        User user = new User(name, username, password);
        userStorage.save(user);
    }

    public Optional<User> getByUsername(String username) {
        return userStorage.findByUsername(username);
    }
}
