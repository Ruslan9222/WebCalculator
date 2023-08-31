package by.ruslan.radevich.webcalculator.domain;

import by.ruslan.radevich.webcalculator.entity.Operation;
import by.ruslan.radevich.webcalculator.entity.User;

public class FloorOperation implements Operation {
    private final double num;
    private final String type;
    private double result;
    private User author;

    public FloorOperation(double num, String type, User author) {
        this.num = num;
        this.type = type;
        this.author = author;
    }

    @Override
    public Operation execute() {
        this.result=Math.floor(num);
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
