package by.ruslan.radevich.webcalculator.storage;

import by.ruslan.radevich.webcalculator.entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationStorage implements OperationStorage {
    private static final List<Operation> operations = new ArrayList<>();

    @Override
    public void save(Operation operation) {
        operations.add(operation);

    }

    @Override
    public List<Operation> findAllByAuthorUsername(String username) {
        return operations.stream()
                .filter(operation -> operation.getAuthor().getUsername().equals(username))
                .toList();
    }
}
