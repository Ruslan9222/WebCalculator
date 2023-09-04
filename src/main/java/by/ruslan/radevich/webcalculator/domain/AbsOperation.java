package by.ruslan.radevich.webcalculator.domain;

import by.ruslan.radevich.webcalculator.entity.Operation;

public class AbsOperation implements Operation {
    private final double num;
    private final String type;
    private double result;
    private  String author;


    public AbsOperation(double num, Type type, String author) {
        this.num = num;
        this.type = String.valueOf(type);
        this.author = author;

    }

    @Override
    public Operation execute() {
        this.result = Math.abs(num);
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
