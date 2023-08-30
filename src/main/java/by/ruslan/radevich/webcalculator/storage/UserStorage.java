package by.ruslan.radevich.webcalculator.storage;

import by.ruslan.radevich.webcalculator.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserStorage {

    void save(User user);

    Optional<User> findByUsername(String username);

}
