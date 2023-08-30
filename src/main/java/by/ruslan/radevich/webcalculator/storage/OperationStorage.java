package by.ruslan.radevich.webcalculator.storage;

import by.ruslan.radevich.webcalculator.entity.Operation;

import java.util.List;

public interface OperationStorage {
    void save(Operation operation);

    List<Operation> findAllByAuthorUsername(String username);

}
