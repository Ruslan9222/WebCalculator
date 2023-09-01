package by.ruslan.radevich.webcalculator.domain;

import by.ruslan.radevich.webcalculator.entity.Operation;
import by.ruslan.radevich.webcalculator.entity.User;

public class SumOperation implements Operation {
    private final double num1;
    private final double num2;
    private double result;
    private final String author;

    public SumOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.author = author();
    }

    @Override
    public Operation execute() {
        this.result = num1 + num2;
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
