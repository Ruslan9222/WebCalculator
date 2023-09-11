package by.ruslan.radevich.webcalculator.factory;

import by.ruslan.radevich.webcalculator.domain.*;
import by.ruslan.radevich.webcalculator.entity.Operation;

import java.util.Optional;

import static by.ruslan.radevich.webcalculator.entity.Operation.Type.*;

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


    public Operation getOperation(String[] values, Operation.Type type, String author) {
        return switch (type) {
            case SUM -> new SumOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1]));

            case ABS -> new AbsOperation(Double.parseDouble(values[0]), type, author);

            case COS -> new CosOperation(Double.parseDouble(values[0]), type, author);

            case DIV -> new DivOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1]), author);

            case FLOOR -> new FloorOperation(Double.parseDouble(values[0]), type, author);

            case LOG -> new LogOperation(Double.parseDouble(values[0]), type, author);

            case MUL -> new MulOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1]), author);

            case SIN -> new SinOperation(Double.parseDouble(values[0]), type, author);

            case SUB -> new SubOperation(Double.parseDouble(values[0]), Double.parseDouble(values[1]));

            case TAN -> new TanOperation(Double.parseDouble(values[0]), type, author);
            default -> throw new RuntimeException();
        };
    }

}

