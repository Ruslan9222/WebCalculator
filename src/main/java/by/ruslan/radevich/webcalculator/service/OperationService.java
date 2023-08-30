package by.ruslan.radevich.webcalculator.service;

import by.ruslan.radevich.webcalculator.entity.Operation;
import by.ruslan.radevich.webcalculator.entity.User;
import by.ruslan.radevich.webcalculator.storage.InMemoryOperationStorage;
import by.ruslan.radevich.webcalculator.storage.OperationStorage;

import java.util.List;
import java.util.Optional;

public class OperationService {
    private static OperationService instance;

    private OperationService() {

    }

    public static OperationService getInstance() {
        if (instance == null) {
            instance = new OperationService();
        }
        return instance;
    }
    private final OperationStorage operationStorage = new InMemoryOperationStorage();

    public Optional<Operation> calculate(double num1, double num2, String type, User author) {
        switch (type) {
            case "sum":
                double v = num1 + num2;
                Operation value = new Operation(num1, num2, type, v, author);
                operationStorage.save(value);
                return Optional.of(value);
            case "sub":
                double v1 = num1 - num2;
                Operation value1 = new Operation(num1, num2, type, v1, author);
                operationStorage.save(value1);
                return Optional.of(value1);
            case "mul":
                double v2 = num1 * num2;
                Operation value2 = new Operation(num1, num2, type, v2, author);
                operationStorage.save(value2);
                return Optional.of(value2);
            case "div":
                double v3 = num1 / num2;
                Operation value3 = new Operation(num1, num2, type, v3, author);
                operationStorage.save(value3);
                return Optional.of(value3);
            case "cos":
                double v4 = Math.cos(num1);
                Operation value4 = new Operation(num1,num2,type,v4,author);
                operationStorage.save(value4);
                return Optional.of(value4);
            case "sin":
                double v5 = Math.sin(num1);
                Operation value5 = new Operation(num1,num2,type,v5,author);
                operationStorage.save(value5);
                return Optional.of(value5);

        }
        return Optional.empty();
    }

    public List<Operation> getHistory(User author) {
        return operationStorage.findAllByAuthorUsername(author.getUsername());
    }
}
