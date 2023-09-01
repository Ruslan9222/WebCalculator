package by.ruslan.radevich.webcalculator.factory;

import by.ruslan.radevich.webcalculator.domain.*;
import by.ruslan.radevich.webcalculator.entity.Operation;

import java.util.Optional;

public class OperationFactory {
    private static OperationFactory instance;

    private OperationFactory() {

    }

    public static OperationFactory getInstance() {
        if (instance == null) {
            instance = new OperationFactory();
        }
        return instance;
    }


    public Optional<Operation> getOperation(String[] values, Operation.Type type, String author) {
        switch (type) {
            case SUM -> {
                return Optional.of(new SumOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1])));
            }
            case ABS -> {
                return Optional.of(new AbsOperation(Double.parseDouble(values[0]), type, author));
            }
            case COS -> {
                return Optional.of(new CosOperation(Double.parseDouble(values[0]), type, author));
            }
            case DIV -> {
                return Optional.of(new DivOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1]), author));
            }
            case FLOOR -> {
                return Optional.of(new FloorOperation(Double.parseDouble(values[0]), type, author));
            }
            case LOG -> {
                return Optional.of(new LogOperation(Double.parseDouble(values[0]), type, author));
            }
            case MUL -> {
                return Optional.of(new MulOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1]), author));
            }
            case SIN -> {
                return Optional.of(new SinOperation(Double.parseDouble(values[0]), type, author));
            }
            case SUB -> {
                return Optional.of(new SubOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1])));
            }
            case TAN -> {
                return Optional.of(new TanOperation(Double.parseDouble(values[0]), type, author));
            }
        }
        return Optional.empty();
    }
}