package by.ruslan.radevich.webcalculator.domain;

import by.ruslan.radevich.webcalculator.entity.Operation;
import by.ruslan.radevich.webcalculator.entity.User;

public class TanOperation implements Operation {
    private final double num;
    private final String type;
    private double result;
    private final String author;

    public TanOperation(double num, Type type, String author) {
        this.num = num;
        this.type = String.valueOf(type);
        this.author = author;
    }

    @Override
    public Operation execute() {
        this.result=Math.tan(num);
        return this;
    }

    @Override
    public double result() {
        return result;
    }

    @Override
    public String author() {
        return author;
    }
}
