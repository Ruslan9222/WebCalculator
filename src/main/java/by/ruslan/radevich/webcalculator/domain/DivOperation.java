package by.ruslan.radevich.webcalculator.domain;

import by.ruslan.radevich.webcalculator.entity.Operation;
import by.ruslan.radevich.webcalculator.entity.User;

public class DivOperation implements Operation {
    private double num1;
    private double num2;
    private double result;
    private User author;

    public DivOperation(double num1, double num2, User author) {
        this.num1 = num1;
        this.num2 = num2;
        this.author = author;
    }

    @Override
    public Operation execute() {
        this.result = num1 / num2;
        return this;
    }

    @Override
    public double result() {
        return result;
    }

    @Override
    public User author() {
        return author;
    }
}
